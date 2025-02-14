package com.aledev.votacaoservice.service.impl;

import com.aledev.votacaoservice.exception.SessionNotFoundException;
import com.aledev.votacaoservice.model.Pauta;
import com.aledev.votacaoservice.model.Session;
import com.aledev.votacaoservice.repository.SessionRepository;
import com.aledev.votacaoservice.service.PautaService;
import com.aledev.votacaoservice.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {

    private static final long DEFAULT_DURATION_MINUTES = 1;
    private final SessionRepository sessionRepository;
    private final MessageSource messageSource;
    private final PautaService pautaService;

    @Override
    public Session abrirSessaoDeVotacao(Long pautaId, Long minutosValidade) {
        LocalDateTime dataInicio = LocalDateTime.now();
        Long duracaoMinutos = (minutosValidade != null && minutosValidade > 0) ? minutosValidade : DEFAULT_DURATION_MINUTES;

        var pauta = pautaService.findById(pautaId);

        Session session = Session.builder()
                .dataInicio(dataInicio)
                .minutosValidade(duracaoMinutos)
                .pauta(pauta)
                .build();

        return sessionRepository.save(session);
    }



    @Override
    public Session findById(Long id) {
        return sessionRepository.findById(id)
                .orElseThrow(() -> new SessionNotFoundException(messageSource));
    }
}

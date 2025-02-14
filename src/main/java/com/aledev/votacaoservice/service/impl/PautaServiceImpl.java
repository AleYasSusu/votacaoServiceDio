package com.aledev.votacaoservice.service.impl;

import com.aledev.votacaoservice.exception.PautaNotFoundException;
import com.aledev.votacaoservice.model.Pauta;
import com.aledev.votacaoservice.repository.PautaRepository;
import com.aledev.votacaoservice.service.PautaService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PautaServiceImpl implements PautaService {

    private  final PautaRepository pautaRepository;
    private final MessageSource messageSource;

    @Override
    public List<Pauta> findAllPautas() {
        return pautaRepository.findAll();
    }

    @Override
    public Pauta createNewPauta(final Pauta pauta) {
        return pautaRepository.save(pauta);
    }



    @Override
    public Pauta findById(Long id) {
        return pautaRepository.findById(id)
                .orElseThrow(() -> new PautaNotFoundException(messageSource));
    }
}

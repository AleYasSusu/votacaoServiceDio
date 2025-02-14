package com.aledev.votacaoservice.controller.impl;

import com.aledev.votacaoservice.controller.SessionController;
import com.aledev.votacaoservice.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/sessions")
public class SessionControllerImpl implements SessionController {

    private final SessionService sessionService;

    @PostMapping("/abrir-sessao")
    public ResponseEntity<String> openVotingSession(@RequestParam Long pautaId,
                                                    @RequestParam(required = false) Long durationMinutes) {
        sessionService.abrirSessaoDeVotacao(pautaId, durationMinutes);
        return ResponseEntity.ok("Sessao aberta com sucesso!.");
    }
}

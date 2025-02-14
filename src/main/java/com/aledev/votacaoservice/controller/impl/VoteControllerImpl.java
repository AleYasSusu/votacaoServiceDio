package com.aledev.votacaoservice.controller.impl;

import com.aledev.votacaoservice.exception.UnableCpfException;
import com.aledev.votacaoservice.model.dto.VoteRequestDto;
import com.aledev.votacaoservice.service.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/votes")
@RequiredArgsConstructor
public class VoteControllerImpl {

    private final VoteService voteService;

    @PostMapping
    public ResponseEntity<String> receiveVote(@RequestBody VoteRequestDto voteRequest) {
        try {
            voteService.receiveVote(voteRequest);
            return ResponseEntity.ok("Voto registrado com sucesso.");
        } catch (IllegalStateException | UnableCpfException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }

    @GetMapping("/voting/result/pauta/{sessionId}")
    public String getVotingResultPauta(@PathVariable Long sessionId) {
        return voteService.getResultadoVotacaoPauta(sessionId);
    }
}
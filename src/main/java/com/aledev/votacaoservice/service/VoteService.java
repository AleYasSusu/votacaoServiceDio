package com.aledev.votacaoservice.service;

import com.aledev.votacaoservice.model.dto.VoteRequestDto;

public interface VoteService {

    void receiveVote(VoteRequestDto voteRequest);

    String getResultadoVotacaoPauta(Long sessionId);
}

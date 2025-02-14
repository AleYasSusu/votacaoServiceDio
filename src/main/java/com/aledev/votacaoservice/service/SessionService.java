package com.aledev.votacaoservice.service;

import com.aledev.votacaoservice.model.Session;

public interface SessionService {

    Session abrirSessaoDeVotacao(Long pautaId, Long minutosValidade);

    Session findById(Long id);
}

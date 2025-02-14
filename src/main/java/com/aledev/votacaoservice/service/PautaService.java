package com.aledev.votacaoservice.service;

import com.aledev.votacaoservice.model.Pauta;

import java.util.List;

public interface PautaService {
    List<Pauta> findAllPautas();

    Pauta createNewPauta(Pauta pauta);


    Pauta findById(Long id);
}

package com.aledev.votacaoservice.controller.impl;

import com.aledev.votacaoservice.controller.PautaController;
import com.aledev.votacaoservice.model.Pauta;
import com.aledev.votacaoservice.service.PautaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/pautas")
@RequiredArgsConstructor
public class PautaControllerImpl implements PautaController {

    private final PautaService pautaService;

    @Override
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Pauta> findAll() {
        return pautaService.findAllPautas();
    }

    @PostMapping
    @Override
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pauta createNewPauta(@Valid @RequestBody Pauta pauta) {
        return pautaService.createNewPauta(pauta);
    }

    @Override
    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Pauta findById(@PathVariable Long id) {
        return pautaService.findById(id);
    }
}

package com.ApplicationRH.AppRH.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationRH.AppRH.dto.CandidatoDTO;
import com.ApplicationRH.AppRH.service.CandidatoService;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
    
    @Autowired
    private CandidatoService candidatoService;

    @PostMapping
    public ResponseEntity<CandidatoDTO> adicionarCandidato(@RequestBody CandidatoDTO dto) {
        CandidatoDTO nCandidato = candidatoService.adicionarCandidato(dto);
        return ResponseEntity.ok(nCandidato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCandidato(@PathVariable Long id) {
        candidatoService.deletarCandidato(id);
        return ResponseEntity.noContent().build();
    }
}

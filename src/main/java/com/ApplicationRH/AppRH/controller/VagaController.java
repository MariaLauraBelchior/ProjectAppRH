package com.ApplicationRH.AppRH.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationRH.AppRH.dto.CandidatoDTO;
import com.ApplicationRH.AppRH.dto.VagaDTO;
import com.ApplicationRH.AppRH.service.CandidatoService;
import com.ApplicationRH.AppRH.service.VagaService;

@RestController
@RequestMapping("/vagas")
public class VagaController {
    
    @Autowired
    private VagaService vagaService;

    @Autowired
    private CandidatoService candidatoService;

    @PostMapping
    public ResponseEntity<VagaDTO> criarVaga(@RequestBody VagaDTO dto) {
        VagaDTO nVaga = vagaService.criarVaga(dto);
        return ResponseEntity.ok(nVaga);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VagaDTO> buscarId(@PathVariable Long id) {
        VagaDTO dto = vagaService.buscarId(id);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VagaDTO> atualizarVaga(@PathVariable Long id, @RequestBody VagaDTO dto) {
        VagaDTO atuVaga = vagaService.atualizarVaga(id, dto);
        return ResponseEntity.ok(atuVaga);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        vagaService.deletarVaga(id);
        return ResponseEntity.noContent().build();
    }


}

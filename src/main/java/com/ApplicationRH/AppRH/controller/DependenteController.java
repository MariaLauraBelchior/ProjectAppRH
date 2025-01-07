package com.ApplicationRH.AppRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationRH.AppRH.dto.DependenteDTO;
import com.ApplicationRH.AppRH.service.DependenteService;

@RestController
@RequestMapping("/dependentes")
public class DependenteController {
    
    @Autowired
    private DependenteService dependenteService;

    @PostMapping
    public ResponseEntity<DependenteDTO> adicionarDependente(@RequestBody DependenteDTO dto) {
        DependenteDTO nDependente = dependenteService.adicionarDependente(dto);
        return ResponseEntity.ok(nDependente);
    }
    
    @GetMapping
    public ResponseEntity<List<DependenteDTO>> findAll() {
        List<DependenteDTO> list = dependenteService.findAll();
        return ResponseEntity.ok(list);
    } 

    @DeleteMapping("/{id}")
    public ResponseEntity<DependenteDTO> deletarDependente(@PathVariable Long id) {
        dependenteService.deletarDependente(id);
        return ResponseEntity.noContent().build();
    }

}

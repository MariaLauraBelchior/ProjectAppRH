package com.ApplicationRH.AppRH.controller;

import java.util.List;

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

import com.ApplicationRH.AppRH.dto.FuncionarioDTO;
import com.ApplicationRH.AppRH.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<FuncionarioDTO> criarFuncionario(@RequestBody FuncionarioDTO dto) {
        FuncionarioDTO nFuncionario = funcionarioService.criarFuncionario(dto);
        return ResponseEntity.ok(nFuncionario);
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> findAll() {
        List<FuncionarioDTO> list = funcionarioService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> buscarId(@PathVariable Long id) {
        FuncionarioDTO dto = funcionarioService.buscarId(id);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioDTO dto) {
        FuncionarioDTO atuFuncionario = funcionarioService.atualizarFuncionario(id, dto);
        return ResponseEntity.ok(atuFuncionario);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> deletarFuncinario(@PathVariable Long id) {
        funcionarioService.deletarFuncionario(id);
        return ResponseEntity.noContent().build();
    }
}

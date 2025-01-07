package com.ApplicationRH.AppRH.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApplicationRH.AppRH.dto.FuncionarioDTO;
import com.ApplicationRH.AppRH.model.Funcionario;
import com.ApplicationRH.AppRH.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public FuncionarioDTO criarFuncionario(FuncionarioDTO dto) {
        Funcionario funcionario = new Funcionario();
        BeanUtils.copyProperties(dto, funcionario);
        funcionario = funcionarioRepository.save(funcionario);
        return new FuncionarioDTO(funcionario);
    }

    public List<FuncionarioDTO> findAll() {
        return funcionarioRepository.findAll()
                .stream()
                .map(FuncionarioDTO::new)
                .collect(Collectors.toList());
    }

public FuncionarioDTO buscarId(Long id) {
    Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Funcionário não encontrada"));
        return new FuncionarioDTO(funcionario);
    }

    public FuncionarioDTO atualizarFuncionario(Long id, FuncionarioDTO dto) {
        Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrada"));
        BeanUtils.copyProperties(dto, funcionario, "id");
        funcionario = funcionarioRepository.save(funcionario);
        return new FuncionarioDTO(funcionario);
    }

    public void deletarFuncionario(Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrada"));
        funcionarioRepository.delete(funcionario);
    }
}

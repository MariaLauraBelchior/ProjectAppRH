package com.ApplicationRH.AppRH.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApplicationRH.AppRH.dto.DependenteDTO;
import com.ApplicationRH.AppRH.model.Dependente;
import com.ApplicationRH.AppRH.repositories.DependenteRepository;

@Service
public class DependenteService {
    
    @Autowired
    private DependenteRepository dependenteRepository;

    public DependenteService(DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    public DependenteDTO adicionarDependente(DependenteDTO dto) {
        Dependente dependente = new Dependente();
        BeanUtils.copyProperties(dto, dependente);
        dependente = dependenteRepository.save(dependente);
        return new DependenteDTO(dependente);
    }

    public List<DependenteDTO> findAll() {
        return dependenteRepository.findAll()
                .stream()
                .map(DependenteDTO::new)
                .collect(Collectors.toList());
    }

    public void deletarDependente(Long id) {
        Dependente dependente = dependenteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dependente não encontrada"));
        dependenteRepository.delete(dependente);
    }
}

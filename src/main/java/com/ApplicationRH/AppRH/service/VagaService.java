package com.ApplicationRH.AppRH.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApplicationRH.AppRH.dto.VagaDTO;
import com.ApplicationRH.AppRH.model.Vaga;
import com.ApplicationRH.AppRH.repositories.VagaRepository;

@Service
public class VagaService {
    
    @Autowired
    private VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public VagaDTO criarVaga(VagaDTO dto) {
        Vaga vaga = new Vaga();
        BeanUtils.copyProperties(dto, vaga);
        vaga = vagaRepository.save(vaga);
        return new VagaDTO(vaga);
    }

    public VagaDTO buscarId(Long id) {
        Vaga vaga = vagaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Vaga não encontrada"));
        return new VagaDTO(vaga);
    }

    
}

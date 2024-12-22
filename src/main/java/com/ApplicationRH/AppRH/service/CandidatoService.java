package com.ApplicationRH.AppRH.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApplicationRH.AppRH.dto.CandidatoDTO;
import com.ApplicationRH.AppRH.model.Candidato;
import com.ApplicationRH.AppRH.repositories.CandidatoRepository;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public CandidatoDTO adicionarCandidato(CandidatoDTO dto) {
        Candidato cand = new Candidato();
        BeanUtils.copyProperties(dto, cand);
        cand = candidatoRepository.save(cand);
        return new CandidatoDTO(cand);
    }

    public void deletarCandidato(Long id) {
        Candidato cand = candidatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidato não encontrada"));
            candidatoRepository.delete(cand);
    }
    
}

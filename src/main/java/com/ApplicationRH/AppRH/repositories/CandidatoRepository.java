package com.ApplicationRH.AppRH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApplicationRH.AppRH.model.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long>{
    
}

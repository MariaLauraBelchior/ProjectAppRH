package com.ApplicationRH.AppRH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApplicationRH.AppRH.model.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Long>{
    
}

package com.ApplicationRH.AppRH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApplicationRH.AppRH.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long>{
    
}

package com.ApplicationRH.AppRH.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ApplicationRH.AppRH.model.Dependente;
import com.ApplicationRH.AppRH.model.Funcionario;

public class FuncionarioDTO {
    
    private long id;
    private String nome;
    private LocalDateTime dataContrato;
    private String email;
    private List<Dependente> dependente;
    
    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Funcionario entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDateTime dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependente> dependente) {
        this.dependente = dependente;
    }
    
    
}

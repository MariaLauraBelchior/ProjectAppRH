package com.ApplicationRH.AppRH.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ApplicationRH.AppRH.model.Candidato;
import com.ApplicationRH.AppRH.model.Vaga;

public class VagaDTO {
    
    private long id;
    private String nome;
    private String descricao;
    private LocalDateTime data;
    private String salario;

    private List<Candidato> candidato;

    public VagaDTO() {
    }

    public VagaDTO(Vaga entity) {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public List<Candidato> getCandidato() {
        return candidato;
    }

    public void setCandidato(List<Candidato> candidato) {
        this.candidato = candidato;
    }

    
    
}

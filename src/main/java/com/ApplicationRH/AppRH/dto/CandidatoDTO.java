package com.ApplicationRH.AppRH.dto;

import org.springframework.beans.BeanUtils;

import com.ApplicationRH.AppRH.model.Candidato;
import com.ApplicationRH.AppRH.model.Vaga;

public class CandidatoDTO {
    
    private long id;
    private String nome;
    private String telefone;
    private String email;
    private Vaga vaga;
    
    public CandidatoDTO() {
    }

    public CandidatoDTO(Candidato entity) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
    
    
}

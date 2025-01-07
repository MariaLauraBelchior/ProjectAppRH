package com.ApplicationRH.AppRH.dto;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import com.ApplicationRH.AppRH.model.Dependente;
import com.ApplicationRH.AppRH.model.Funcionario;

public class DependenteDTO {
    
    private long id;
    private String cpf;
    private String nome;
    private LocalDateTime dataNascimento;
    private Funcionario funcionario;
    
    public DependenteDTO() {
    }

    public DependenteDTO(Dependente entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
}

package com.ApplicationRH.AppRH.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionarioa")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private LocalDateTime dataContrato;
    private String email;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.REMOVE)
    private List<Dependente> dependente;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, LocalDateTime dataContrato, String email, List<Dependente> dependente) {
        this.id = id;
        this.nome = nome;
        this.dataContrato = dataContrato;
        this.email = email;
        this.dependente = dependente;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
    
}

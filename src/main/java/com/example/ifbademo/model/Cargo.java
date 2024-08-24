package com.example.ifbademo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{
    @Column(nullable = false, unique = true, length = 60)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}

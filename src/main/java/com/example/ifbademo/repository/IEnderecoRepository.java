package com.example.ifbademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ifbademo.model.Endereco;

public interface IEnderecoRepository extends JpaRepository<Endereco, Long>{
    
}

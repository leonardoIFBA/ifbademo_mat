package com.example.ifbademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ifbademo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}

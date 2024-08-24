package com.example.ifbademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ifbademo.model.Departamento;

public interface IDepartamentoRepository extends JpaRepository<Departamento, Long> {

    
} 

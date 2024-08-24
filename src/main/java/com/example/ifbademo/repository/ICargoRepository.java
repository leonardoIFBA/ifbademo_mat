package com.example.ifbademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ifbademo.model.Cargo;


public interface ICargoRepository extends JpaRepository<Cargo, Long>{
    
}

package com.example.ifbademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ifbademo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long>{
    public Funcionario findByNome(String nome);
    public List<Funcionario> findByNomeAndSalario(String nome, Double salario);
}

package com.example.ifbademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ifbademo.model.Cargo;
import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.model.Endereco;
import com.example.ifbademo.model.Funcionario;
import com.example.ifbademo.model.UF;
import com.example.ifbademo.repository.ICargoRepository;
import com.example.ifbademo.repository.IDepartamentoRepository;
import com.example.ifbademo.repository.IEnderecoRepository;
import com.example.ifbademo.repository.IFuncionarioRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class Ifbademo_matApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ifbademo_matApplication.class, args);
	}

	//obtem uma saída para o console
	@Bean
	//public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(ICargoRepository carRep, 
	IDepartamentoRepository depRep,  
							IFuncionarioRepository funRep) {
		return (args) -> {

			
			Departamento d = new Departamento();
			d.setNome("SEG_TESTE");
			depRep.save(d);

			Cargo c = new Cargo();
			
			c.setNome("agente de segurança");
			c.setDepartamento(d);
			carRep.save(c);

			Endereco e = new Endereco();
			e.setLogradouro("Rua A");
			e.setNumero(10);
			e.setBairro("Centro");
			e.setCep("46100000");
			e.setComplemento("casa");
			e.setCidade("Brumado");
			e.setUf(UF.BA);

			Funcionario f = new Funcionario();
			f.setNome("leonardo");
			f.setDataEntrada(LocalDate.now());
			f.setSalario(new BigDecimal("1000.00"));
			f.setEndereco(e);
			funRep.save(f);

			System.out.println(depRep.findAll());
			System.out.println(carRep.findAll());
			System.out.println(funRep.findAll());
			System.out.println(f.getEndereco().getLogradouro());
			
			
		};
	}
}

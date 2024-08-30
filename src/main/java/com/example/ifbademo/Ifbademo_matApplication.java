package com.example.ifbademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ifbademo.model.Cargo;
import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.repository.ICargoRepository;
import com.example.ifbademo.repository.IDepartamentoRepository;
import com.example.ifbademo.repository.IEnderecoRepository;
import com.example.ifbademo.repository.IFuncionarioRepository;

@SpringBootApplication
public class Ifbademo_matApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ifbademo_matApplication.class, args);
	}

	//obtem uma saída para o console
	@Bean
	//public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(ICargoRepository caRep, 
	IDepartamentoRepository depRep, IEnderecoRepository endRep, 
							IFuncionarioRepository funRep) {
		return (args) -> {

			Cargo c = new Cargo();
			c.setNome("SEGURANÇA");
			//caRep.save(c);

			Departamento d = new Departamento();
			d.setNome("TI");
			//depRep.save(d);

			//criar a inclusao do endereco e do funcionario
			//System.out.println(funRep.findAll());
			System.out.println(funRep.findByNome("LEO"));
			System.out.println(funRep.findByNomeAndSalario("GOKU", 500D));
			
		};
	}
}

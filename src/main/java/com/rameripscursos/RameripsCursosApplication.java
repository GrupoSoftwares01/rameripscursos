package com.rameripscursos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rameripscursos.domain.Categoria;
import com.rameripscursos.repositories.CategoriaRepository;

@SpringBootApplication
public class RameripsCursosApplication implements CommandLineRunner {
	
	//Aqui abaixo será criado um objeto "categoriaRepository" da classe "CategoriaRepository"
	//Com a anotação "@Autowired" o objeto "categoriaRepository" é instanciado automaticamente
	@Autowired
	private CategoriaRepository categoriaRepository;	
	
	//Aqui está o método principal "main()" da aplicação "ramerips_cursos"
	public static void main(String[] args) {
		SpringApplication.run(RameripsCursosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		//Aqui abaixo está sendo criado dois novos objetos da classe "Categoria"
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		//
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
}

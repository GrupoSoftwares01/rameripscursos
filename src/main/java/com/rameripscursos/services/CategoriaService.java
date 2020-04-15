package com.rameripscursos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rameripscursos.domain.Categoria;
import com.rameripscursos.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//Aqui abaixo será criado um objeto "repo" da classe "CategoriaRepository"
	//Com a anotação "@Autowired" o objeto "repo" é instanciado automaticamente
	@Autowired
	private CategoriaRepository repo;
	
	//Aqui será implementado um método que busque uma categoria junto ao "Banco de Dados"
	public Categoria buscar(Integer id) { 
		Optional<Categoria> obj= repo.findById(id); 
		return obj.orElse(null); 
	}
}

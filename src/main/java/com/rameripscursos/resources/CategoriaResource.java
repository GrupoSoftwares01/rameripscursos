package com.rameripscursos.resources;

//Para o click de teclas de atalho de importações das bibliotecas usa-se -> "CTRL +SHIFT + O"

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rameripscursos.domain.Categoria;
import com.rameripscursos.services.CategoriaService;

//Com o click "CTRL + SPACE" é exibido um autocomplete de opções
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//Aqui abaixo será criado um objeto "service" da classe "CategoriaService"
	//Com a anotação "@Autowired" o objeto "service" é instanciado automaticamente
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		//
		Categoria obj = service.buscar(id);
		//
		return ResponseEntity.ok().body(obj);
		
		/*  //Aqui foi para um teste do programador
			//Aqui abaixo está sendo criado dois novos objetos da classe "Categoria"
			Categoria cat1 = new Categoria(1, "Informática");
			Categoria cat2 = new Categoria(2, "Escritório");
			
			//A importação da classe "List" é do tipo "java.util.List"
			List<Categoria> lista = new ArrayList<>();
			//Aqui abaixo será adicionado à lista os objeto "cat1 e cat2"
			lista.add(cat1);
			lista.add(cat2);
			
			//Aqui foi implementado para teste do desenvolvedor
			//return "REST está funcionando!";
			
			//Aqui abaixo será retornado a lista de categorias.
			return lista;
		*/
	}
}

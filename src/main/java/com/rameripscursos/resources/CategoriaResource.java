package com.rameripscursos.resources;

//Para o click de teclas de atalho de importações das bibliotecas usa-se -> "CTRL +SHIFT + O"

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Com o click "CTRL + SPACE" é exibido um autocomplete de opções
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}

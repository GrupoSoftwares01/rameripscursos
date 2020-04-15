package com.rameripscursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rameripscursos.domain.Categoria;

//Aqui abaixo será implementada uma classe que fará as consultas, inserção, deleção,
//atualização dos dados relacionada a tabela categoria por meio dos seu "Id",  
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}

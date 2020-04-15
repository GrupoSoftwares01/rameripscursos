package com.rameripscursos.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Atalho para a importação das bibliotecas necessárias, click em "CTRL + SHIFT + O"
//Aqui abaixo temos a criação da classe principal deste layout
//O "@Entity" tem que ser o do "java.persistence.Entity"
@Entity
public class Categoria implements Serializable {
	//O "serialVersionUID = 1L" é gerado para implementar o "Serializable" acima
	private static final long serialVersionUID = 1L;
	
	//Aqui será gerenciada a criação automática dos "Ids" da classe "Categoria"
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Aqui abaixo temos a criação dos atributos e seus tipos da classe "Categoria"
	private Integer id;
	private String nome;
	
	//Atalho para implementação de construtores, click em "ALT + SHIFT + S" e escolha opção
	//Aqui temos a implementação obrigatória de um construtor vazio da classe "Categoria"
	public Categoria() {		
	}
	
	//Aqui temos a implementação obrigatória de um construtor povoando seu atributos
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Aqui abaixo temos todos os "Gets e Sets" desta classe "Categoria"
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Aqui abaixo gera um código numérico para cada objeto
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	//Aqui abaixo faz a comparação entre dois objetos considerando várias possibilidades
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}












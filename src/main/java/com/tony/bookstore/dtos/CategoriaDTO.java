package com.tony.bookstore.dtos;

import com.tony.bookstore.domain.Categoria;

import jakarta.validation.constraints.NotEmpty;

public class CategoriaDTO {

	private Integer id;
	@NotEmpty(message = "O campo NOME, não pode ser vazio")
	private String nome;
	@NotEmpty(message = "O campo DESCRIÇÃO, não pode ser vazio")
	private String descricao;
	
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}

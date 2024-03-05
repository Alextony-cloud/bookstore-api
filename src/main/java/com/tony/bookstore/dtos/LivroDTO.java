package com.tony.bookstore.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.tony.bookstore.domain.Livro;

import jakarta.validation.constraints.NotEmpty;

public class LivroDTO  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@NotEmpty(message = "O campo TITULO, não pode ser vazio")
	@Length(min = 3, max = 50, message = "O campo TITULO deve ter entre 3 e 50 caracteres")
	private String titulo;
	@NotEmpty(message = "O campo NOME DO AUTOR, não pode ser vazio")
	@Length(min = 3, max = 50, message = "O campo NOME DO AUTOR deve ter entre 3 e 50 caracteres")
	private String nome_autor;
	
	public LivroDTO() {
		super();
	}

	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
		this.nome_autor = obj.getNome_autor();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

}

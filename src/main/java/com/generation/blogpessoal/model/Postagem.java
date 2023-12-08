package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens") // CREATE TABLE tb_postagens

public class Postagem {
	
	@Id //indica que o Id é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Define o auto incremento
	private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O campo título é obrigatório!") //Não permite que o usuário não preencha o campo
	@Size(min = 5, max = 100, message = "O campo título deve conter no mínimo 5 e no máximo 100 caractéres.")
	private String titulo;

	@Column(length = 1000)
	@NotBlank(message = "O campo de texto é de preenchimento obrigatório!") //Não permite que o usuário não preencha o campo
	@Size(min = 10, max = 1000, message = "O campo texto deve conter no mínimo 5 e no máximo 100 caractéres.")
	private String texto;
	
	
	@UpdateTimestamp //atualiza a data e a hora de postagem e atualização da postagem
	private LocalDateTime data;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}

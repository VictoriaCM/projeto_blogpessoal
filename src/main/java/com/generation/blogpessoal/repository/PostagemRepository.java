package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//long é o atributo da Pk Id
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	

}

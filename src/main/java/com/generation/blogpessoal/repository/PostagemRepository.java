package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

//long é o atributo da Pk Id
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	
	//Método para fazer a busca textual pela postagem (SELECT * FROM t_postagens WHERE LIKE "%TEXTO%");
	List<Postagem> findAllByTituloContainingIgnoreCase(@Param ("titulo")String titulo);
}

package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") //permite requisições de outras origens (servidores), em produção ao invés de * se coloca o endereço do front end
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	//Trazer todas as postagens da tabela
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		return  ResponseEntity.ok(postagemRepository.findAll());
	
}
}

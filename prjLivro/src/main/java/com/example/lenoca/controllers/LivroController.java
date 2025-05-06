package com.example.lenoca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lenoca.entities.Livro;
import com.example.lenoca.services.LivroService;



@RestController
@RequestMapping("/livros")
public class LivroController {

private final LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@PostMapping("/create")
	public Livro createLivro(@RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	@GetMapping("/{id}")
	public Livro getLivro(@PathVariable Long id) {
		return livroService.findLivroByid(id);
	}
	
	@GetMapping("/all")
	public List<Livro> getAllLivros(){
		return livroService.findAllLivros();
	}
}

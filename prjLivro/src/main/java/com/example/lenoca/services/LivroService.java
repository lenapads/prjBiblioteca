package com.example.lenoca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lenoca.entities.Livro;
import com.example.lenoca.repositories.LivroRepository;

@Service
public class LivroService {
	private final LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro findLivroByid(Long id) {
		Optional<Livro> livro = livroRepository.findById(id);
		return livro.orElseGet(null);
	}
	
	public List<Livro> findAllLivros(){
	  return livroRepository.findAll();	
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
}

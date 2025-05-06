package com.example.lenoca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lenoca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}

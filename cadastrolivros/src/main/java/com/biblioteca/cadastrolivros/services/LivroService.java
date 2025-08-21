package com.biblioteca.cadastrolivros.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.cadastrolivros.models.LivroModel;
import com.biblioteca.cadastrolivros.repositories.LivroRepository;

import jakarta.persistence.Id;

@Service
public class LivroService {
  @Autowired
  LivroRepository livroRepository;
  public void salvarLivro(LivroModel livroModel) {
	  livroRepository.save(livroModel);
  }
  public List<LivroModel> listarTodosLivros(){
	  return livroRepository.findAll();
  }
  public Optional<LivroModel> listarLivroPorId(long id) {
	  return livroRepository.findById(id);
  }
  public void deletarLivroPorId(long id) {
	  livroRepository.deleteById(id);
  }
  public void atualizarLivro(LivroModel livroModel) {
	  LivroModel livroAtualizado = new LivroModel();
	  livroAtualizado .setAutor(livroModel.getAutor());
	  livroAtualizado .setIsbn(livroModel.getIsbn());
	  livroAtualizado .setTitulo(livroModel.getTitulo());
	  livroRepository.save(livroAtualizado );
  }
  
}

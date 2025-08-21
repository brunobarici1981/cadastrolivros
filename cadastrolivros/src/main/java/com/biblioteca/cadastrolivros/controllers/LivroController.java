package com.biblioteca.cadastrolivros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.cadastrolivros.models.LivroModel;
import com.biblioteca.cadastrolivros.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
	LivroService livroService;
    @PostMapping("/cadastrarLivro")
    public ResponseEntity<String> cadastrarLivro(@RequestBody LivroModel livro){
    	livroService.salvarLivro(livro);
    	return ResponseEntity.ok("livro cadastrado");
       }
   @GetMapping() 
    public List<LivroModel> ListarLivros(){
    	return livroService.listarTodosLivros();
    }
   
}

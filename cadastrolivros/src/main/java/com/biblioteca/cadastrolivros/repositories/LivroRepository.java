package com.biblioteca.cadastrolivros.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.cadastrolivros.models.LivroModel;

import jakarta.persistence.Id;

@Repository
public interface LivroRepository extends JpaRepository <LivroModel,Long>{

}

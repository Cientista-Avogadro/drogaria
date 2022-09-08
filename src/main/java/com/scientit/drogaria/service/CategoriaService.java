package com.scientit.drogaria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scientit.drogaria.domain.Categoria;
import com.scientit.drogaria.repository.CategoriaRepository;

@Service
public class CategoriaService {
  @Autowired
  private CategoriaRepository categoriaRepository;

  public Categoria getCategoryById(Short codigo) {
    Optional<Categoria> resCategory = categoriaRepository.findById(codigo);
    if (resCategory.isEmpty()) {
      throw new RuntimeException("Categoria não encontrada");
    }
    Categoria categoria = resCategory.get();

    return categoria;
  }

}
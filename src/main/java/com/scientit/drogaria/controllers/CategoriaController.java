package com.scientit.drogaria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scientit.drogaria.domain.Categoria;
import com.scientit.drogaria.repository.CategoriaRepository;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
  @Autowired
  private CategoriaRepository categoriaRepository;

  @GetMapping
  public List<Categoria> getAllCategory() {
    return categoriaRepository.findAll();
  }

  @PostMapping
  public Categoria postCategory(@RequestBody Categoria category) {
    return categoriaRepository.save(category);
  }

  @DeleteMapping("/{codigo}")
  public Optional<Categoria> deleteCategory(@PathVariable Short codigo) {
    Optional<Categoria> categoria = categoriaRepository.findById(codigo);
    categoriaRepository.delete(categoria.get());
    return categoria;
  }
}
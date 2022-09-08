package com.scientit.drogaria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.scientit.drogaria.domain.Categoria;
import com.scientit.drogaria.exception.RecursoNaoEncontradoException;
import com.scientit.drogaria.repository.CategoriaRepository;
import com.scientit.drogaria.service.CategoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
  @Autowired
  private CategoriaService categoriaService;

  @GetMapping
  public List<Categoria> getAllCategory() {
    return categoriaService.getAllCategory();
  }

  @GetMapping("/{codigo}")
  public Categoria getCategoryById(@PathVariable Short codigo) {
    try {
      return categoriaService.getCategoryById(codigo);
    } catch (RecursoNaoEncontradoException err) {
      throw new ResponseStatusException(
          HttpStatus.NOT_FOUND,
          "Categoria não encontrada",
          err);
    }

  }

  /*
   * @PostMapping
   * public Categoria postCategory(@RequestBody Categoria categoria) {
   * return categoriaRepository.save(categoria);
   * }
   */

  /*
   * @DeleteMapping("/{codigo}")
   * public Optional<Categoria> deleteCategory(@PathVariable Short codigo) {
   * Optional<Categoria> categoria = categoriaRepository.findById(codigo);
   * categoriaRepository.delete(categoria.get());
   * return categoria;
   * }
   */

  /*
   * @PutMapping
   * public Categoria editCategory(@RequestBody Categoria categoria) {
   * return categoriaRepository.save(categoria);
   * }
   */
}
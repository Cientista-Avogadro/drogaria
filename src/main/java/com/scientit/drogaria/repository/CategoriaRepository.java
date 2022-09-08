package com.scientit.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientit.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {

}
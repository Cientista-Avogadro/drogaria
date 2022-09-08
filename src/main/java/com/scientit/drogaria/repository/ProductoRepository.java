package com.scientit.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientit.drogaria.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Short> {
  
}
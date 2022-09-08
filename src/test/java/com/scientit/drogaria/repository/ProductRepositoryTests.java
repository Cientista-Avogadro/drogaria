package com.scientit.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scientit.drogaria.domain.Producto;

@SpringBootTest
public class ProductRepositoryTests {
  @Autowired
  private ProductoRepository productoRepository;

  @Test
  public void inserir() {
    Producto producto1 = new Producto(
        null,
        "Coca-Cola",
        Byte.valueOf("15"),
        BigDecimal.valueOf(10.50),
        LocalDate.of(2022, 9, 21));

    Producto producto2 = new Producto(
        null,
        "Heineken",
        Byte.valueOf("10"),
        BigDecimal.valueOf(8.50),
        LocalDate.of(2022, 9, 25));

    productoRepository.save(producto1);
    productoRepository.save(producto2);

  }
}
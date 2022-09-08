package com.scientit.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductoTests {

  @Test
  public void criar() {
    Producto producto = new Producto(
        Short.valueOf("1"),
        "Coca-Cola",
        Byte.valueOf("15"),
        BigDecimal.valueOf(10.50),
        LocalDate.of(2022, 9, 21));

    System.out.println("test" + producto);
  }
}
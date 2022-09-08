package com.scientit.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
  private Short codigo;
  private String nome;
  private Byte quantidade;
  private BigDecimal preco;
  private LocalDate dataDeValidade;
}

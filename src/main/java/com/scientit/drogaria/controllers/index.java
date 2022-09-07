package com.scientit.drogaria.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class index {

  @RequestMapping("/")
  String Home() {
    return "Seja bem-vindo a Drogaria Api";
  }
}

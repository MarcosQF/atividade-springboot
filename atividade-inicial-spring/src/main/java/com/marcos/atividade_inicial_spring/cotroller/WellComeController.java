package com.marcos.atividade_inicial_spring.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wellcome")
public class WellComeController {

  @GetMapping
  public String wellcome() {
    return "Seja bem vindo";
  };

  @GetMapping("/{name}")
  public String welcomeName(@PathVariable String name) {
    return "Bem-vindo, " + name + "!";
  }

}

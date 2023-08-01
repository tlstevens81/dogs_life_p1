package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Hero;
import com.db.grad.javaapi.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroController {

  @Autowired
  HeroService heroService;

  @GetMapping("/heroes")
  public List<Hero> getAllHeroes(){
    return heroService.getAllHeroes();
  }
}

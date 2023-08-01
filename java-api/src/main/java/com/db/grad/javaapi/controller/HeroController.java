package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Hero;
import com.db.grad.javaapi.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HeroController {

  @Autowired
  HeroService heroService;

  @GetMapping("/heroes")
  public List<Hero> getAllHeroes(){
    return heroService.getAllHeroes();
  }

  @PostMapping("/hero")
  public HttpStatus saveNewHero(@RequestBody Hero hero) {
    Hero result = heroService.saveNewHero(hero);
    if(result == null) {
      return HttpStatus.PRECONDITION_FAILED;
    } else {
      return HttpStatus.CREATED;
    }
  }
}

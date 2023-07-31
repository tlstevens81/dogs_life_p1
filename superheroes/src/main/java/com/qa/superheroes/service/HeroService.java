package com.qa.superheroes.service;

import com.qa.superheroes.model.Hero;
import com.qa.superheroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService
{
    @Autowired
    private HeroRepository heroRepository;

    public List<Hero> getHeroesStartingWithLetter(String letter){
        String letterParam = letter + "%";
        List<Hero> heroes = heroRepository.findHeroesNameStartingWithLetter(letterParam);
        return heroes;
    }

    public List<Hero> getAllHeroes(){
        return heroRepository.findAll();
    }

    public List<Hero> getLastThreeHeroesByName(){
        return heroRepository.findTop3ByOrderByNameDesc();
    }

    public Hero saveHero(Hero hero){
        return heroRepository.save(hero);
    }
}

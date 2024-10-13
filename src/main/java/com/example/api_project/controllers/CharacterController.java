package com.example.api_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Pour que Spring sache que c'est un controller
@RequestMapping("/api/characters") // Pour preciser le endpoint
public class CharacterController {

    @GetMapping("") // Si jamais il y a un parametre comme l'id
    public void getCharacters() {
        System.out.println("GET /api/characters");
    }
}

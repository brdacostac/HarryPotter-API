package com.example.api_project.controllers;

import com.example.api_project.domain.Character;
import com.example.api_project.services.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Pour que Spring sache que c'est un controller
@RequestMapping("/api/characters") // Pour preciser le endpoint
public class CharacterController {


    private final CharacterService characterService;

    public CharacterController(CharacterService service) {
        this.characterService = service;
    }

    @GetMapping("") // Si jamais il y a un parametre comme l'id
    public ResponseEntity<List<Character>> getCharacters() {
        List<Character> characters = characterService.getCharactersFromLibrary();
        System.out.println(characters);
        return ResponseEntity.ok().body(characters);
    }
}

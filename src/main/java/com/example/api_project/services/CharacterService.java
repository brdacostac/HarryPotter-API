package com.example.api_project.services;

import com.example.api_project.domain.Character;

import com.example.api_project.feigh.CharacterClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterClient characterClient;

    public CharacterService(CharacterClient client) {
        this.characterClient = client;
    }

    public List<Character> getCharactersFromLibrary() {
        return this.characterClient.getCharacters();
    }
}

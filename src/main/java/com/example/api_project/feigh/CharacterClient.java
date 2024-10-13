package com.example.api_project.feigh;


import com.example.api_project.domain.Character;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "harrypotter-api", url = "https://harrypotter-api.s3.eu-north-1.amazonaws.com")
public interface CharacterClient {

    @GetMapping("/characters.json")
    List<Character> getCharacters();
}

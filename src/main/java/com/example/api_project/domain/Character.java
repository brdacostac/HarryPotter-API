package com.example.api_project.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter // Pour generer les getters
@Setter // Pour generer les setters
@AllArgsConstructor // Pour generer le constructeur avec tous les attributs
@NoArgsConstructor // Pour generer le constructeur sans attributs
public class Character {

    public String id;
    public String name;
    @JsonProperty("alternate_names") // Pour respecter la convention de nommage camelCase de java, on utilise JsonProperty pour mapper ce string, vue que dans le json on va avoir un snake_case
    public List<String> alternateNames;
    public String species;
    public String gender;
    public String house;
    public String dateOfBirth;
    public int yearOfBirth;
    public boolean wizard;
    public String ancestry;
    public String eyeColour;
    public String hairColour;
    public Wand wand;
    public String patronus;
    public boolean hogwartsStudent;
    public boolean hogwartsStaff;
    public String actor;
    @JsonProperty("alternate_actors")
    public List<String> alternateActors;
    public boolean alive;
    public String image;

}

package com.example.api_project.domain;

import lombok.Getter;
import lombok.Setter;


//Je pouvais utiliser lombok pour generer le constructeur aussi, mais bon, cette classe n'avait pas trop d'attributs.
@Setter
@Getter
public class Wand {
        public String wood;
        public String core;
        public int length;

        public Wand(String wood, String core, int length) {
            this.wood = wood;
            this.core = core;
            this.length = length;
        }

        public Wand() {
        }
}

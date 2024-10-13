package com.example.api_project.domain;

import lombok.Getter;
import lombok.Setter;

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

}

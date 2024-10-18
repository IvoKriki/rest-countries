package com.krikiivo.rest.countries.model;

import lombok.Data;

@Data
public class Demonyms {
    private Gender eng;

    @Data
    public static class Gender {
        private String f;
        private String m;

    }
}

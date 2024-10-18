package com.krikiivo.rest.countries.model;

import lombok.Data;

import java.util.List;

@Data
public class Car {
    private List<String> signs;
    private String side;
}

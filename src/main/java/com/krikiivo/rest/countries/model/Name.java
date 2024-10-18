package com.krikiivo.rest.countries.model;

import lombok.Data;

import java.util.Map;
@Data
public class Name {
    private String common;
    private String official;
    private Map<String, NativeName> nativeName;
}

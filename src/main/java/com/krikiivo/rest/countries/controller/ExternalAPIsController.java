package com.krikiivo.rest.countries.controller;

import com.krikiivo.rest.countries.client.ApiClient;
import com.krikiivo.rest.countries.model.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/external")
public class ExternalAPIsController {

    private final ApiClient apiClient;

    public ExternalAPIsController(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @GetMapping()
    public ResponseEntity<List<Country>> consumeApi() {
        ResponseEntity<List<Country>> response = apiClient.getData();
        return ResponseEntity.ok(response.getBody());
    }
}

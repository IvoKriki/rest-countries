package com.krikiivo.rest.countries.client;

import com.krikiivo.rest.countries.model.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "apiClient", url = "${restcountries.api.url}")
public interface ApiClient {

    @GetMapping
    ResponseEntity<List<Country>> getData();
}


package com.krikiivo.rest.countries.client;

import com.krikiivo.rest.countries.model.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "apiClient", url = "https://restcountries.com/v3.1")
public interface ApiClient {

    @GetMapping("/all")
    ResponseEntity<List<Country>> getData();

}

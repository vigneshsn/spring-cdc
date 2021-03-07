package com.vigneshsn.springdemoconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingsController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String sayHelloToEmployee(@RequestParam String id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        ResponseEntity<Employee> responseEntity = restTemplate.exchange(
                "http://localhost:8090/employees/"+ id,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                Employee.class);
        return "Hello "+ responseEntity.getBody().getName();
    }
}

package com.cypcode.integration_microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController {

    @Value("${backend-microservice.url}")
    private String configServerUrlValue;

    @GetMapping("integration")
    public ResponseEntity<?> getIntegration(){
        return ResponseEntity.ok(String.format("Hi, from integrations: %s", configServerUrlValue));
    }
}

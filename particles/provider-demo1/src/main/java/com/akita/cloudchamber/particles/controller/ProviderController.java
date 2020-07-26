package com.akita.cloudchamber.particles.controller;

import com.akita.cloudchamber.particles.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Autowired
    private ProviderService service;

    @GetMapping("/get")
    public String get() {
        return service.get();
    }
}

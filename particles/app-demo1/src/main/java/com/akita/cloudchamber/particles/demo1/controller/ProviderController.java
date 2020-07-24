package com.akita.cloudchamber.particles.demo1.controller;

import com.akita.cloudchamber.particles.demo1.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @GetMapping("/get/{name}")
    public String get(@PathVariable String name) {
        return providerService.get(name);
    }

}

package com.akita.cloudchamber.particles.controller;

import com.akita.cloudchamber.particles.provider.ProviderDemo1Client;
import com.akita.cloudchamber.particles.provider.ProviderDemo2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ProviderDemo1Client demo1Client;

    @Autowired
    private ProviderDemo2Client demo2Client;

    @GetMapping("/get1")
    public String get1() {
        return demo1Client.get();
    }

    @GetMapping("/get2")
    public String get2() {
        return demo2Client.get();
    }

}

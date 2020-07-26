package com.akita.cloudchamber.particles.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider-demo2")
public interface ProviderDemo2Client {
    @GetMapping("/get")
    String get();
}

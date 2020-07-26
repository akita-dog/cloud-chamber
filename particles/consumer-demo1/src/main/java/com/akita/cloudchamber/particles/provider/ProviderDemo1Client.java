package com.akita.cloudchamber.particles.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider-demo1")
public interface ProviderDemo1Client {

    @GetMapping("/get")
    String get();
}

package com.akita.cloudchamber.particles.demo1.service.impl;

import com.akita.cloudchamber.particles.demo1.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String get(String name) {
        return String.format("hello!!!----%s", name);
    }
}

package com.akita.cloudchamber.particles.service.impl;

import com.akita.cloudchamber.particles.service.ProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Value("${test.val}")
    private String testConfigVal;

    @Override
    public String get() {
        return testConfigVal;
    }
}

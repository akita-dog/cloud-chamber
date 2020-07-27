package com.akita.cloudchamber.particles.service.impl;

import com.akita.cloudchamber.particles.service.ProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ProviderServiceImpl implements ProviderService {
    @Value("${nacos.test.val}")
    private String testConfigVal;

    @Override
    public String get() {
        return testConfigVal;
    }
}

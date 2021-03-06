package com.akita.cloudchamber.particles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDemo1Application.class, args);
    }
}

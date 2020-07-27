package com.manipal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class CapitalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapitalServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSample() {
		return Sampler.ALWAYS_SAMPLE;
	}
}

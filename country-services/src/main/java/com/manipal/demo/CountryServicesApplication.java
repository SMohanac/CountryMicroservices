package com.manipal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CountryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryServicesApplication.class, args);
	}

	@Bean
	public Sampler defaultSample() {
		return Sampler.ALWAYS_SAMPLE;
	}
}

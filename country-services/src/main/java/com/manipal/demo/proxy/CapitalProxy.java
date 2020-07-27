package com.manipal.demo.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Capital;

@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "capital-service")
public interface CapitalProxy {
			@GetMapping("/capital-service/capital-service/capital/countryCode/{countryCode}")
			public Capital getCountryCapitalCode(@PathVariable String countryCode);
	}
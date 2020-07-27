package com.manipal.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.repository.CapitalRepository;

@RestController
public class CapitalController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private Environment environment;
	@Autowired
	private CapitalRepository capitalRepository;
	
	@GetMapping("/capital-service/capital/{capitalName}")
	public Capital getCapitalName(@PathVariable String capitalName){
		Capital capital1 = capitalRepository.findByCapitalName(capitalName);
		capital1.setPort(Integer.parseInt(environment.getProperty("server.port")));	
		
		logger.info("capital Bean {}",capital1);
		return capital1;
		
	}	
		@GetMapping("/capital-service/capital/zipcode/{zipcode}")
		public Capital getCapitalZipcode(@PathVariable String zipcode){
			Capital capital2 = capitalRepository.findByZipcode(zipcode);
			capital2.setPort(Integer.parseInt(environment.getProperty("server.port")));	
			logger.info("capital Bean {}",capital2);
			
			return capital2;
		
	}	
		@GetMapping("/capital-service/capital/countryCode/{countryCode}")
		public Capital getCapitalCountryCode(@PathVariable String countryCode){
			Capital capital2 = capitalRepository.findByCountryCode(countryCode);
			capital2.setPort(Integer.parseInt(environment.getProperty("server.port")));
			
			logger.info("capital Bean {}",capital2);
			
			return capital2;
		
	}	
}
	


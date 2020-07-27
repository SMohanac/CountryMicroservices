package com.manipal.demo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.service.CountryService;



@RestController
public class CountryController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
    @Autowired
    private CountryService countryService;
   
    @RequestMapping("/country-services/country/{countryCode}")
    public Country getDetailsByCountryCode(@PathVariable String countryCode) {
    Country country = countryService.getByCountryCode(countryCode);
    Capital capital = countryService.getCapitalDetails(countryCode);
	capital.setPort(Integer.parseInt(environment.getProperty("server.port")));

	country.setCapital(capital);
	logger.info("country Bean {}",country);
	return country;
}
}
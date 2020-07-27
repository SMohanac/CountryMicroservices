package com.manipal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.proxy.CapitalProxy;
import com.manipal.demo.repository.CountryRepository;



@Service
public class CountryService {
	@Autowired
	private CapitalProxy capitalProxy;
	@Autowired
	private CountryRepository countryrepository;


	public Capital getCapitalDetails(String CapitalCode) {
		Capital capital = capitalProxy.getCountryCapitalCode(CapitalCode);

		return capital;
	}

	public Country getByCountryCode(String countryCode)
	{
		return countryrepository.findByCountryCode(countryCode);
	}


}
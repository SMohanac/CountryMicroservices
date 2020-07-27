package com.manipal.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.manipal.demo.model.Country;

 
public interface CountryRepository extends MongoRepository<Country,String>{
    public Country findByCountryCode(String countryCode);
    
}
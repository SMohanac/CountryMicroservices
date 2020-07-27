package com.manipal.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.manipal.demo.model.Capital;


public interface CapitalRepository extends JpaRepository<Capital, String> {
Capital findByCapitalName(String capitalName);
Capital findByZipcode(String zipcode);
Capital findByCountryCode(String countryCode);

}
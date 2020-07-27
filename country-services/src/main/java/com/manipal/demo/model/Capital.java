package com.manipal.demo.model;

public class Capital {
	private String zipcode;
	private	String capitalName;
	private	String language;
	private	Long population;
	private	String countryCode;

	private	int port;
	
	public Capital()  {}
	
	
	public Capital(String zipcode, String capitalName, String language, Long population, String countryCode, int port) {
		super();
		this.zipcode = zipcode;
		this.capitalName = capitalName;
		this.language = language;
		this.population = population;
		this.countryCode = countryCode;
		this.port = port;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getName() {
		return capitalName;
	}
	public String getLanguage() {
		return language;
	}
	public Long getPopulation() {
		return population;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public int getPort() {
		return port;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setName(String name) {
		this.capitalName = name;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public void setPort(int port) {
		this.port = port;
	}

}

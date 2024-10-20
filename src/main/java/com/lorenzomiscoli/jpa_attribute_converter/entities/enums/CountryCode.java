package com.lorenzomiscoli.jpa_attribute_converter.entities.enums;

public enum CountryCode {
	
	ITALY("ita");

	private String value;
	
	CountryCode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

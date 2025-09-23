package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder {
	private String companyName;

	public Company(String companyName, int taxId) {
		super(taxId);
		if (companyName == null) {
        throw new IllegalArgumentException("Company name cannot be null.");
    }
		this.companyName = companyName;

	}

	public String getCompanyName() {
		return this.companyName;
	}

}

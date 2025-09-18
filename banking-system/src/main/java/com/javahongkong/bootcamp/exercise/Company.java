package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder {
	private String companyName;

	public Company(String companyName, int taxId) {
		// complete the function
		super(taxId);
		if (companyName == null) {
        throw new IllegalArgumentException("Company name cannot be null.");
    }
		this.companyName = companyName;

	}

	public String getCompanyName() {
		// complete the function
		return this.companyName;
	}

}

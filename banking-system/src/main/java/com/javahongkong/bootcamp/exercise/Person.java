package com.javahongkong.bootcamp.exercise;

import java.util.Objects;

public class Person extends AccountHolder {
	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		super(idNumber);
		if (firstName == null || lastName == null) {
        throw new IllegalArgumentException("Neither first name nor last name can be null.");
    }
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		// complete the function
		return this.firstName;
	}

	public String getLastName() {
		// complete the function
		return this.lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
		  return true;
		if (!(obj instanceof Person))
		  return false;
		Person person = (Person) obj;
		return Objects.equals(super.getIdNumber(), person.getIdNumber());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.idNumber);
	}

}

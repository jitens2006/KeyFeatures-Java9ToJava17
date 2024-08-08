
package com.jiten;

/*
 * 
 */
public record Contractor(String firstName, String lastName, String type, String id, String address,
		String rating) implements Employee {

	@Override
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getRating() {
		return rating;
	}
}

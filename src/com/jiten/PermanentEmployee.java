package com.jiten;

/* Java 14 Record Type
 * 
 */
public record PermanentEmployee(String firstName, String lastName, String type, String id, String address,
		String rating) implements Employee {

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
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

	public String getAddress() {
		return address;
	}

	public String getRating() {
		return rating;
	}
}

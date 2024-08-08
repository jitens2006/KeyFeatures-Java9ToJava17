package com.jiten;

/*
 * Java 17: Sealed Classes and Sealed Interfaces
 */
public sealed interface Employee permits PermanentEmployee, Contractor {

	public String getFirstName();

	public String getLastName();

	public String getType();

	public String getId();

	public String getRating();

	public String getAddress();
}

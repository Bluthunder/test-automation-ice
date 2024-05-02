package com.ch.common.bean;

public class NewAddress {

	String firstName = "";

	String lastName = "";

	String country = "";

	String address1 = "";

	String city = "";

	String zipCode = "";

	String phonenumber = "";

	String state = "";

	public NewAddress(String[] data) {

		firstName = data[0];
		lastName = data[1];
		country = data[2];
		address1 = data[3];
		city = data[4];
		zipCode = data[5];
		phonenumber = data[6];
		state = data[7];
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress1() {
		return address1;
	}

	public String getState() {
		return state;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setState(String state) {
		this.state = state;
	}

}

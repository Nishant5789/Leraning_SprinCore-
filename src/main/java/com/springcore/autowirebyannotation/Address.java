package com.springcore.autowirebyannotation;

public class Address {
	private String street;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city) {
		super();
		System.out.println("Address class constuctor  called");
		this.street = street;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("Address class setting method called");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}

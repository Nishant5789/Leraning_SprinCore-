package com.springcore.autowirebyannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address1")
	Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("EMp class set method is called");
		this.address = address;
	}

	public Emp(Address address) {
		super();
		System.out.println("parameterinze constructor is called");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}

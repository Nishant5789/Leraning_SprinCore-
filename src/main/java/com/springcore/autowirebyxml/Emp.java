package com.springcore.autowirebyxml;

public class Emp {
	Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("set method is called");
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

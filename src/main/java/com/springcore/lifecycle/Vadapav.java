package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vadapav {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vadapav [price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("start is called");
	}
	@PreDestroy
	public void end() {
		System.out.println("end is called");
	}
	
	

}

package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


// intializingbean provide afterpropertisset method and disposable provide destroy method
public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "price [price=" + price + "]";
	}
		
	public void destroy() throws Exception {
		System.out.println("destroy is called pepsi");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init is called pepsi");
		
	}

}

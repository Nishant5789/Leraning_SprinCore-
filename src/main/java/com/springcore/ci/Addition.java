package com.springcore.ci;

public class Addition {
	
	private int a;
	private int b;
	
	/// if string based prameter fiels is not exists then order is prefer
	public Addition(double a, double b) {
		super();
		System.out.println("double based contructor called");
		this.a = (int) a;
		this.b = (int) b;
	}
	public Addition(int a, int b) {
		super();
		System.out.println("int based contructor called");
		this.a = a;
		this.b = b;
	}

	/*
	 * // try to comment strign based construter than order prefer
	 */	
	
	
	
	
	 
	public int getsum()  {
		return a+b;
	}
	

}

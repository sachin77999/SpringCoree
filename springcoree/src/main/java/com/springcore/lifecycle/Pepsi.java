package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		// init 
		
		System.out.println("taking pepsi: init");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy 
		
		System.out.println("Going to put bottle back to shop : destroy");
		
		
	}

}

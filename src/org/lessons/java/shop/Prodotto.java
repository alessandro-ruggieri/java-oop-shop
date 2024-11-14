package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int productCode;
	private String name;
	private String description;
	private double price;
	private double tax;
	
	Prodotto () {
		setCode();
		tax = 0.22;
	}
	
	Prodotto (String name, String description, double price) {
		this ();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	private void setCode() {
		Random ran = new Random();
		productCode = ran.nextInt(99999);
	}
	
	double getBasePrice() {
		return price;
	}
	
	double getTaxedPrice() {
		double taxAmount = price * tax;
		double taxedPrice = price + taxAmount;
		return taxedPrice;
	}
	
	String productIdentification() {
		return productCode + "-" + name;
	}
	
	String getDescription () {
		return description;
	}
}


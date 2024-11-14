package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int productCode;
	String name;
	String description;
	double price;
	double tax = 0.22;
	
	void setCode() {
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
}

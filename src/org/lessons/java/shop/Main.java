package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto product1 = new Prodotto();
		product1.setCode();
		product1.name = "Samsung Galaxy S24";
		product1.description = "Smartphone Samsung di ultima generazione";
		product1.price = 799.99;
		product1.tax = 0.22;
		
		Prodotto product2 = new Prodotto();
		product2.setCode();
		product2.name = "Apple iPhone 16";
		product2.description = "Smartphone Apple di ultima generazione";
		product2.price = 979.99;
		product2.tax = 0.22;
		
		System.out.println("Il primo prodotto è: " + product1.productIdentification());
		System.out.println("Il prezzo del primo prodotto è: " + product1.getBasePrice() + "€");
		System.out.println(String.format("Il prezzo ivato del primo prodotto è %.2f", product1.getTaxedPrice()));
		
		System.out.println("Il secondo prodotto è: " + product2.productIdentification());
		System.out.println("Il prezzo del secondo prodotto è: " + product2.getBasePrice() + "€");
		System.out.println(String.format("Il prezzo ivato del secondo prodotto è %.2f", product2.getTaxedPrice()));
	}

}

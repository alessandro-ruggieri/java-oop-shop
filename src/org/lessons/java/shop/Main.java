package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto product1 = new Prodotto("Samsung Galaxy S24", "Smartphone Samsung di ultima generazione" , 799.99);

		Prodotto product2 = new Prodotto("Apple iPhone 16", "Smartphone Apple di ultima generazione", 979.99);
		
		System.out.println("Il primo prodotto è: " + product1.productIdentification());
		System.out.println("La descrizione del prodotto è: " + product1.getDescription());
		System.out.println("Il prezzo del primo prodotto è: " + product1.getBasePrice() + "€");
		System.out.println(String.format("Il prezzo ivato del primo prodotto è %.2f", product1.getTaxedPrice()));
		
		System.out.println("");
		
		System.out.println("Il secondo prodotto è: " + product2.productIdentification());
		System.out.println("La descrizione del prodotto è: " + product2.getDescription());
		System.out.println("Il prezzo del secondo prodotto è: " + product2.getBasePrice() + "€");
		System.out.println(String.format("Il prezzo ivato del secondo prodotto è %.2f", product2.getTaxedPrice()));
	}

}

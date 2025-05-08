package Prodotti;

import java.util.HashMap;
import java.util.Map;

public class Prodotto1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Double> prodotti = new HashMap<>();
	        prodotti.put("Riso", 2.00);
	        prodotti.put("Latte", 2.00);
	        prodotti.put("Pasta", 1.20);
	        prodotti.put("Uova", 2.50);
	        prodotti.put("Carne", 7.00);

	        System.out.println("Tutti i prodotti:");
	        for (Map.Entry<String, Double> entry : prodotti.entrySet()) {
	            System.out.println(entry.getKey() + " - €" + entry.getValue());
	        }
	        
	        double soglia = 3.00;
	        System.out.println("\nProdotti con prezzo sopra €" + soglia + ":");
	        for (Map.Entry<String, Double> entry : prodotti.entrySet()) {
	            if (entry.getValue() > soglia) {
	                System.out.println(entry.getKey() + " - €" + entry.getValue());
	            }
	        }
	        
	        double somma = 0;
	        for (double prezzo : prodotti.values()) {
	            somma += prezzo;
	        }
	        double media = somma / prodotti.size();
	        System.out.printf("\nPrezzo medio: €%.2f%n", media);
	    }
   

	}


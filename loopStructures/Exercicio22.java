//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		int quantProducts = 15;
		int codProduct;
		double priceProducts; 
		double maxPriceProducts = 0; 
		double avgPriceProducts = 0;
		
		for (int i = 0; i < quantProducts; i++){
			
			System.out.print("Enter the product code: ");
			codProduct = scNum.nextInt();
			System.out.print("Enter the product price: ");
			priceProducts = scNum.nextDouble();
			System.out.println();
			
			if (priceProducts > maxPriceProducts){
				
				maxPriceProducts = priceProducts;
				
				}
				
				avgPriceProducts += priceProducts;
			
			}
			
			System.out.printf("The highest price read was %.2f and the arithmetic mean was %.2f", maxPriceProducts, (avgPriceProducts / quantProducts));
		
		scNum.close();
	}
}


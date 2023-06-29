//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		boolean repeat = true;
		int printer = 1;
		int cont = 0;
		System.out.print("Enter the number of terms: ");
		int numTerms = scNum.nextInt();
		 
		while (repeat){
			
			if (numTerms == 0){
				
				repeat = false;
				
				}
			
			if (numTerms < 0) {
				
		System.out.print("Enter the number of terms: ");
		numTerms = scNum.nextInt();
		
		}
		
		if (numTerms > 0 ) {
			
			System.out.print(printer + " ");
		printer ++; 
		cont++;
		if (cont == numTerms){
			
			repeat = false;
			
			}
			
			}
		
	}
		
		scNum.close();
	}
}


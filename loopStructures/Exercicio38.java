//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio38 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		boolean repeat = true;
		int printer = 0;
		int harmony = -1;
		int cont = 0;
		System.out.print("Enter the number of terms: ");
		int numTerms = scNum.nextInt();
		 
		while (repeat == true){
			
			if (numTerms == 0){
				
				repeat = false;
				
				}
			
			if (numTerms < 0) {
				
		System.out.print("Enter the number of terms: ");
		numTerms = scNum.nextInt();
		
		}
		
		if (numTerms > 0 ) {
		
		if (printer == 0) {
			
			System.out.print(printer + " ");
			
			} else{
		System.out.print("(" + harmony + "/" + printer+ ")" + " ");
		}
		cont ++;
		printer++;
		harmony++;
		
		if (cont == numTerms){
			
			repeat = false;
			
			}
			
			}
		
	}
		
		scNum.close();
	}
}


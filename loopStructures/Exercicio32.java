//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio32 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		boolean repeat = true;
		int printer = 0;
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
			
			System.out.print(printer + " ");
		printer += 2; 
		cont++;
		if (cont == numTerms){
			
			repeat = false;
			
			}
			
			}
		
	}
		
		scNum.close();
	}
}


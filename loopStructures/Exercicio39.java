//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio39 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		boolean repeat = true;
		double printer = 1;
		int cont = 0;
		double sum = 0;
		System.out.print("Enter the number of terms: ");
		int numTerms = scNum.nextInt();
		int aux = numTerms;
		 
		while (repeat == true){
			
			if (numTerms == 0){
				
				repeat = false;
				
				}
			
			if (numTerms < 0) {
				
		System.out.print("Enter the number of terms: ");
		numTerms = scNum.nextInt();
		aux = numTerms;
		
		}
		
		if (numTerms > 0 ) {
		
		System.out.print((int)printer + "/" + aux + " ");
		sum += (printer / aux);
		cont ++;
		printer++;
		aux--;
		
		if (cont == numTerms){
			
			repeat = false;
			
			}
			}	
	}
		
		System.out.println();
		System.out.println("The sum of the terms of the sequence was equal to: " + sum);
		
		scNum.close();
	}
}


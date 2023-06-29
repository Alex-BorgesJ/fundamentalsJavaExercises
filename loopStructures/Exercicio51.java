//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio51 {
	
	public static void main (String[] args) {
	Scanner scNum = new Scanner (System.in);
	
	System.out.print("Enter the quantity of terms in the sequence: ");
	int numTerms = scNum.nextInt(); 
	int term1 = 0;
	int term2 = 1;
	boolean prime = true;

	for (int i = 0; i < numTerms; i++){
		
		if (prime){
			System.out.print(term1);
			prime = false;
			} else {
				System.out.print(", " + term1);
				}
		
		int nextTerm = term1 + term2;
		
		term1 = term2;
		term2 = nextTerm;
		
		}

	scNum.close();	
	}
}


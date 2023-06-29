//Alex Borges da Silva Junior 

import java.util.Scanner; 

public class Exercicio54 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		int firstTerm, finalTerm, enterValid; 
		
		do {
			
		System.out.print("Enter a first number of Fibonacci sequence:  ");
		firstTerm = scNum.nextInt();
		 
		 int a = 0; 
		 int b = 1;
		 
		 while (b < firstTerm){
			 int aux = b; 
			 b = a + b; 
			 a = aux;
			 }
			 
			 enterValid = b; 
		} while (enterValid != firstTerm);
		
		do {
			
		System.out.print("Enter a final number of Fibonacci sequence: ");
		finalTerm = scNum.nextInt();
		
		int a = 0; 
		 int b = 1;
		 
		 while (b < finalTerm){
			 int aux = b; 
			 b = a + b; 
			 a = aux;
			 }
			 
			 enterValid = b;
			 
		} while (enterValid != finalTerm);
		
		int term1 = 0;
		int term2 = 1;
		boolean valid = true;
		boolean prime = true;
		
		while (valid){
			
					if (term1 >= firstTerm){
						
							if (prime){
					System.out.print(term1);
					prime = false;
					} else {
						System.out.print(", " + term1); 
						}
						
						}
				
				int nextTerm = term1 + term2;
				term1 = term2;
				term2 = nextTerm;
				valid = (term1 > finalTerm ? false : true);
			}
		
		scNum.close();
	}
}


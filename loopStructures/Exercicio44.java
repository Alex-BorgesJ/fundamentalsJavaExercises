//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio44 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the number of terms: ");
		int numTerms = scNum.nextInt();
		int cont = 1;
		int aux  = 1;
		
		do {
			
			int factorial = 1;
			
			for (int i = aux; i >= 1; i--){
				
				factorial *= i;
				
				}
				
				if ( cont ==1){
					
				System.out.print(factorial);
				
					} else {
						
						System.out.print(", " + factorial); 
						
						}
			
			cont++;
			aux++;
			} while (cont <= numTerms);
		
		scNum.close();
	}
}


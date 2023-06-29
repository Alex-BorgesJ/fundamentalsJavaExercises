//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio62 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of terms of sequence: ");
		int quant = scNum.nextInt();
		double termDividend = 2;
		double termDivisor = 1;
		boolean prime = true;
		double sum = 0;
		
		for (int cont = 1; cont <= quant; cont++){
				
				if (prime){
					System.out.print( (int)termDividend + "/" + (int)termDivisor);
					prime = false;
				}else {
					System.out.print(", " + (int)termDividend + "/" + (int)termDivisor);
					}
					
					sum += (termDividend / termDivisor);
					
					termDividend += (termDividend > 0 ? 2 : -2);
					termDivisor += 2;
					termDividend *= -1;
					
			}
			
			System.out.println();
			System.out.println("The sum of all terms is equal to: " + sum);
		
		
		scNum.close();
	}
}


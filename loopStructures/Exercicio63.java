//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio63 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of terms of sequence: ");
		int quant = scNum.nextInt();
		double termDividend = 1;
					int a = 0;
					int b = 1;
		double termDivisor = 1;
		boolean prime = true;
		double sum = 0;
		
		for (int cont = 1; cont <= quant; cont++){
					

					//proximo termo de Fibonacci------------------
					int nextTermDividend = a + b;
					a = b;
					b = nextTermDividend;
					if (a > 1){
					termDividend = a;
					}
				//-------------------------------------------------------------------
				//proximo termo prim-------------------------------------
				boolean termPrime = true;
				do {
					termDivisor++;
					int contPrime = 0;
					
					for (int i = 1; i <= termDivisor; i++){
						contPrime += (termDivisor % i == 0 ? 1 : 0);
						}
					if (contPrime == 2){
							termPrime = false;
						}
						
					} while (termPrime);
					//-----------------------------------------------------------------------------------
					
						if (prime){
					System.out.print( (int)termDividend + "/" + (int)termDivisor);
					prime = false;
				}else {
					System.out.print(", " + (int)termDividend + "/" + (int)termDivisor);
					}
					
										sum += (termDividend / termDivisor);
			}
			
			System.out.println();
			System.out.printf("The sum of all terms is equal to: %.2f", sum);
		
		
		scNum.close();
	}
}


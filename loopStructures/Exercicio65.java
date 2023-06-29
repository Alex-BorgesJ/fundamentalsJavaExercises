//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio65 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of terms of sequence: ");
		int quant = scNum.nextInt();
		double termDividend = 0;
		double termDivisor = 1;
		boolean prime = true;
		boolean factorialP = true;
		double sum = 0;
		
		for (int cont = 0; cont < quant; cont++){
					

					//proximo termo de Fatoriais------------------
					if (factorialP){
						
						int factorial = 1;
						
						for (int i = cont; i > 0; i--){
								factorial *= i;
							}
							
						termDividend = factorial;
						termDividend *= -1;
						factorialP = false;
						
						} else {
						termDividend *= -1;

							int factorial = 1;
												
							for (int i = cont; i > 0; i--){
									factorial *= i;
								}
							termDividend = factorial;

							factorialP = true;
							
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
					//------------------/-/----------------------------------------------------------------
					
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


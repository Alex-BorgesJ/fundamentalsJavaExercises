//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio61 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of terms of sequence: ");
		int quant = scNum.nextInt();
		int termDividend = 2;
		int termDivisor = 1;
		boolean prime = true;
		
		for (int cont = 1; cont <= quant; cont++){
				
				if (prime){
					System.out.print(termDividend + "/" + termDivisor);
					prime = false;
				}else {
					System.out.print(", " + termDividend + "/" + termDivisor);
					}
					
					termDividend += 2; termDivisor += 2;
					
			}
		
		
		scNum.close();
	}
}


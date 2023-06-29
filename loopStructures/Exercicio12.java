//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner(System.in); 
		
		int cont = 10; 
		int i = 0; 
		double soma = 0; 
		
		do {
			
			System.out.print("Informe um numero ==> ");
			double num = scNum.nextDouble();
			
			soma += num;
						
			i++; 
			} while ( i < cont);
		
		System.out.println();
		System.out.println("O valor total da soma deste número e: " + soma);
		
		scNum.close(); 
	}
}


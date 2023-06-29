//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
	Scanner scNum = new Scanner (System.in);
	
	int i = 0;
	double soma = 0;
	
	System.out.println("\tInforme dez(10) numeros");
	
	do {
		
		System.out.print("Informe numero " + (i + 1)+ " ==> ");
		double num = scNum.nextDouble();
		
		soma += (num < 40 ? num : 0);
		
		i++; 
		} while (i < 10);
		
		System.out.println();
		System.out.println("A soma dos numero inferios a 40 e igual a: " + soma);
	
	scNum.close(); 	
	}
}


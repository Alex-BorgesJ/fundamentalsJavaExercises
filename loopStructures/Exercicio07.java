//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		int numero;
		
		do{
			
			System.out.print("Informe um valor inteiro, contido entre 1 e 10 incluse: ");
			numero = scNum.nextInt(); 
			
			} while (numero < 1 || numero > 10);
			
			int mult = 1; 
			System.out.println("\tTabuada"); 
			
			while (mult <= 10){
				
				System.out.println("\t" + numero + " * " + mult + " = " + (numero*mult));
				
				mult++; 
				}
		
		scNum.close(); 
	}
}


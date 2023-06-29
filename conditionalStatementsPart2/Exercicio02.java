//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe um valor ==> ");
		double num = scNum.nextDouble();
		
		if (num >= 0){
			
			System.out.println("VALOR POSITIVO"); 
			
			} else {
				
				System.out.println("VALOR NEGATIVO");
				
				}
		
		scNum.close(); 
	}
}


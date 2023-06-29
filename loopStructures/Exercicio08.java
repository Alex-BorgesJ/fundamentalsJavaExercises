//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		double [] vet = new double[10];			
			int cont = 0; 
		
		for (int i = 0; i < 10; i++){
			
			System.out.print("Informe um valor: ");
			vet[i] = scNum.nextDouble();
			
			}
			
			for (int i = 0; i < 10; i++){
				
				if ( vet[i] <  0){
					
					cont++;
					
					}
				
				}
				
				System.out.println("Foram lidos " + cont + " valores NEGATIVOS");
		
		scNum.close();
	}
}


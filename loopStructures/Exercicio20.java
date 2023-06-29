//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio20 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		double valueMax = 0;
		double valueMin = 0; 
		
		System.out.println("\tInforme 100 valores");
		
		for (int i = 0; i < 100; i++){
			
			System.out.print("informe um valor " + (i+1) + " : ");
			double valueNum = scNum.nextDouble();
			
			valueMax = (valueNum > valueMax ? valueNum : valueMax);
			valueMin = (valueNum < valueMin ? valueNum : valueMin);
			
			}
		
		System.out.println();
		System.out.println("O menor valor foi " + valueMin);
		System.out.println("O maior valor foi " + valueMax);
		
		scNum.close();
	}
}


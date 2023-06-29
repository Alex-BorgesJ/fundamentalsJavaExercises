//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe um valor: ");
		int a =  scNum.nextInt();
		System.out.print("Informe outro valor: ");
		int b = scNum.nextInt();
		
		if (a == b){
			
			System.out.println("Valores invalidos");
			System.exit(0);
			
			}
			
			int maior = (a > b) ? a : b;
				
				System.out.printf("O valor %d e maior", maior);
		
		
		scNum.close(); 
	}
}


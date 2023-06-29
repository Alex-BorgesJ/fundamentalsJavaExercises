//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe um valor: ");
		double a = scNum.nextDouble();
		System.out.print("Informe outro valor: "); 
		double b = scNum.nextDouble();
		
		if (a == b){
			
			System.out.println("VALORES INVALIDOS");
			System.exit(0);
			
		}
		
		double aux = 0; 
		
		if (a > b){
			
			aux = a; 
			a = b; ;
			b = aux;
			
			}
			
			System.out.printf("Em ordem crescente primeiro vem %.2f e depois vem %.2f", a, b);
		
		scNum.close();
	}
}


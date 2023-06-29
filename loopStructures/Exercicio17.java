//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		Scanner scStr = new Scanner(System.in);
		Scanner scNum = new Scanner(System.in);
		
		char choice;
		double nota1, nota2;
		
		do {
			
			do{
				
				System.out.print("Informe a 1a. nota: ");
				nota1 = scNum.nextDouble();
				
				if(nota1 < 0 || nota1 > 10 ){
					
					System.out.println("ERRO!!!  Valor invalido, informe um valor valido");
					
					}
				
				} while (nota1 < 0 || nota1 > 10 );
			
			do{
				
				System.out.print("Informe a 2a. nota: ");
				nota2 = scNum.nextDouble();
				
				if(nota2 < 0 || nota2 > 10 ){
					
					System.out.println("ERRO!!!  Valor invalido, informe um valor valido");
				}
				} while (nota2 < 0 || nota2 > 10 );
				
				double media = (nota1 + nota2) / 2.0; 
				
				System.out.printf("A media simples das notas eh igual a: %.1f%n", media);
				System.out.println();
				
				System.out.print("NOVO CALCULO  (S/N)? ");
				choice = scStr.next().charAt(0);
			
			} while (choice == 'S');

		scStr.close(); scNum.close();
	}
}


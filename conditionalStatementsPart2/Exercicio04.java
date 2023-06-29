//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in); 
		
		System.out.print("Informe a nota da primeira avaliacao: ");
		float nota1 = scNum.nextFloat();
		System.out.print("Informe a nota da segunda avaliacao: ");
		float nota2 = scNum.nextFloat();
		
		float media = (nota1 + nota2) / 2.0f; 
		
		if (media >= 6.0){
			
			System.out.printf("APROVADO, com media %.1f", media);
			
			} else {
				
				System.out.printf("REPROVADO, com media %.1f", media);
				
				}
		
		scNum.close(); 
	}
}


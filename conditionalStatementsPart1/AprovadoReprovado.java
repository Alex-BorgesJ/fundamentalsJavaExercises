//Alex Borges da Silva Junior 

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner(System.in); 
		
		System.out.print("Digite o valor da nota: "); 
		double nota = scNum.nextDouble(); 
		
		if (nota >= 0.0 && nota <= 10.0){
			
			if (nota >= 6.0){
			
				System.out.println("APROVADO");
			
			} else {
				
					System.out.println("REPROVADO");
				
				}
			
			} else {
				
				System.out.println("VALOR INVALIDO"); 
				
				}
		
		scNum.close(); 
	}
}


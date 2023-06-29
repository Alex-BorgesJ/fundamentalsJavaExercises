//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio46 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe um numero: ");
		int num = scNum.nextInt(); 
		
		int quant = 0; 
		
		for (int i = 1; i <= num; i++){
			
			if (num % i == 0){
				
				quant++;
				
				}
			
			}
			
			if (quant == 2){
				
				System.out.println("O numero informa eh primo!"); 
				
				} else {
					
					System.out.println("O numero informado nao eh primo!"); 
					
					}
		
		scNum.close();
	}
}


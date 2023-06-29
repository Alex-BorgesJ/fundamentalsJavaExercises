//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio10{
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		int armazena = 0; 
		int i = 0; 
		
		do {
			
			System.out.print("Informe um valor: ");
			int numero = scNum.nextInt(); 
			
			armazena += numero; 
			
			i++; 
			} while (i < 10); 
			
			int media = armazena / 10; 
			
			System.out.println("A media aritimetica deste valores e " + media );0
		
		scNum.close(); 
	}
}


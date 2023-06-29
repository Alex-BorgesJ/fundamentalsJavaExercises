//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe um valor ==>  ");
		double value = scNum.nextDouble();
		
		char eAcentuado = '\u00C9';
		char aAcentuado = '\u00C3';
		
		
		if (value > 10.0){
			
			System.out.println(eAcentuado + " MAIOR QUE 10!");
			
			} else {
				
				System.out.println("N"+ aAcentuado +"O " + eAcentuado + " MAIOR QUE 10!");
				
				}
		
		scNum.close(); 
	}
}


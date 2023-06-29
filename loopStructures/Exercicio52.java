//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio52 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int num = scNum.nextInt();
		
		int term1 = 0;
		int term2 = 1; 
		
		while (term2 < num){
		
			int aux = term2;
			term2 = term1 + term2;
			term1 = aux;
			
			}
		
		if (term2 == num) {
			System.out.println(num + " belongs to the Fibonacci sequence.");
			} else {
				System.out.println(num + " does not belong to the Fibonacci sequence.");
				}
		
		scNum.close();
	}
}


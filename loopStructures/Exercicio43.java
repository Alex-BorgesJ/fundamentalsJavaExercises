//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		int cont = 0;
		int num = 0;
		
		do {
			
			System.out.print("Enter an integer number: ");
			num = scNum.nextInt();
			
			int factorial = 1;
			
			for (int i = num; i >= 1; i--){
				
				factorial *= i;
				
				}
			
			System.out.println("The factorial of " + num + " is equal to: " + factorial);
			cont++;
			System.out.println();
			
			} while (cont < 7);
		
		scNum.close();
	}
}


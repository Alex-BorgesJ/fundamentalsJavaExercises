//Alex Borges da Silva Junior 

import java.util.Scanner; 

public class Exercicio41 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		System.out.print("Enter a number and find out its factorial: ");
		int number = scNum.nextInt();
		int factorial = 1; 
		
		for (int i = number; i >= 1; i--){
			
			factorial *= i;
			
			}
			
			System.out.println("The factorial is equal to: " + factorial); 
		
		scNum.close(); 
	}
}


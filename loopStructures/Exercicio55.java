//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Exercicio55{
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter an interger: ");
		int num = scNum.nextInt();
		int sum = 0;
		
		for (int i = num -1 ; i > 	0; i--){
			
			if (num % i == 0) {
				
				sum += i; 
				
				}
			
			}
		
		if (num == sum){
				System.out.print("This number is perfect!");
			} else {
					System.out.print("This number is not perfect!"); 
				}
		
		scNum.close();
	}
}


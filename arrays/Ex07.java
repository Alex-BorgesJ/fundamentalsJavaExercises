//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex07 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int length = 0, vector[], maxValue = 0, minValue = 0;
		
		do {
		
			System.out.print("Enter the size of the vector: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 20);
		
		vector = new int[length];
		
		System.out.println("\n\tEnter the values of the terms in the vector\n");
		
		for (int i = 0 ; i < length ; i++) {
		
			System.out.print("Enter the integer value of term #" + i + ": ");
			vector[i] = sc.nextInt();
		
		}
		
		for (int element : vector){
		
			if (element < minValue ){
				minValue = element;
			}
			
			if (element > maxValue){
				maxValue = element;
			}
		
		}
		
		System.out.println("\n\tLargest value: " + maxValue);
		System.out.println("\tSmallest value: " + minValue);
		
		sc.close();
	}
}


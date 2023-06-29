//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex04 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int length = 0, vectorD[];
		
		do {
		System.out.print("\n Enter the quantity of elements: ");
		length = sc.nextInt();
		
		} while (length <= 0 || length > 20);
		
		vectorD = new int[length]; 
		
		System.out.println("\n\tEnter with " + length + " intergers elements\n");
		
		for (int i = 0; i < length; i++){
		
			System.out.print("Enter #" + i + " element: ");
			vectorD[i] = sc.nextInt();
		
		}
		
		System.out.println();
		
		for (int element : vectorD){
		
			System.out.print(" " + element);
		
		}
		 
		sc.close();
	}
}


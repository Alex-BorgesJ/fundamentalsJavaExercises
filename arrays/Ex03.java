//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex03 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int length = 0, vectorC[];
		
		do {
		System.out.print("\n Enter the quantity of elements: ");
		length = sc.nextInt();
		
		} while (length <= 0 || length > 20);
		
		vectorC = new int[length]; 
		
		System.out.println("\n\tEnter with " + length + " intergers elements\n");
		
		for (int i = 0; i < length; i++){
		
			System.out.print("Enter #" + i + " element: ");
			vectorC[i] = sc.nextInt();
		
		}
		
		System.out.println();
		
		for (int element : vectorC){
		
			System.out.print(" " + element);
		
		}
		 
		sc.close();
	}
}


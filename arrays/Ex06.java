//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Ex06 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int length = 0, vectorA[], vectorB[];
		boolean areEqual = false; 
		
		do{
		
			System.out.print("\n Enter the number of terms in the vectors: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 15);
		
		vectorA = new int[length];
		vectorB = new int[length];
		
		System.out.println("\n\tTerms of fisrt vector\n"); 
		
		for (int i = 0; i < length; i++){
		
			System.out.print("Enter #" + i + " terms: ");
			vectorA[i] = sc.nextInt();
		
		}
		
		System.out.println("\n\tTerms of second vector\n"); 
		
		for (int i = 0; i < length; i++){
		
			System.out.print("Enter #" + i + " terms: ");
			vectorB[i]= sc.nextInt();
		
		}
		
		System.out.println();
		
		for (int i = 0; i < length; i++){
		
		 areEqual = false;
		 
		 if (vectorA[i] == vectorB[i]){
				areEqual = true;
			}
		
			if (areEqual){
			
				System.out.println("The elements at position #"+ i +" are equal, and they are: " + vectorA[i]);
			
			}
		
		}
		
		sc.close();
	}
}


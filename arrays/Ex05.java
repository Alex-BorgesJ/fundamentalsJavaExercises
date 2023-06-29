//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex05 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int length = 0, vectorA[], vectorB[], vectorC[];
		
		do{
		
			System.out.print("\n Enter the quantity of elements for the vectors: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length >15);
		
		vectorA = new int[length];
		vectorB = new int[length];
		vectorC = new int[length];
		
		System.out.println("\n\tFirst vector\n");
		
		for (int i = 0; i < length; i++){
		
			System.out.print(" Enter #" + i + " element: ");
			vectorA[i] = sc.nextInt();
		
		}
		
		System.out.println("\n\tSecond vector\n");
		
		for (int i = 0; i < length; i++){
		
			System.out.print(" Enter #" + i + " element: ");
			vectorB[i] = sc.nextInt(); 
		
		}
		
		for (int i = 0; i < length; i++){
		
		vectorC[i]= vectorA[i] + vectorB[i];
		
		}
		
		System.out.println(" \nSum of the vectors: ");
		
		for (int element : vectorC){
		
			System.out.print(" " + element);
		
		}
		
		sc.close();
	}
}


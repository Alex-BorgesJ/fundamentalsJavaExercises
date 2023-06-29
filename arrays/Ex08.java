//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex08 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sumTerms = 0, vectF[] = new int[5];
		
		System.out.println("\n\tEnter the integer value of the elements in vector F\n");
		
		for (int i = 0 ; i < vectF.length ; i++){
		
			System.out.print(" Enter the value of term #" + i + ": ");
			vectF[i] = sc.nextInt();
		
		}
		
		for (int element : vectF){
		
			if (element  % 2 != 0){
			
				sumTerms += element; 
			
			}
			
		}
		
		if (sumTerms == 0){
		
			System.out.println(" The vector does not contain odd values.");
		
		} else {
		
			System.out.println(" The sum of the odd terms in the vector is equal to " + sumTerms);
		
		}
		
		sc.close();
	}
}


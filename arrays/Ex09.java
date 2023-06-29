//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex09 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vectorG[], vectorH[], length = 0;
		vectorG = new int[5];
		
		System.out.println("\n\tprovide the elements of vector G\n");
		
		for (int i = 0 ; i < vectorG.length ; i++){
		
			System.out.print(" Enter the integer value of element #" + i + ": ");
			vectorG[i] = sc.nextInt(); 
		
		}
		
		for (int element : vectorG){
		
			length += ( element % 2 == 0 ? 1 : 0 );
		
		}
		
		if (length != 0) {
		
			vectorH = new int[length];
			int j = 0;
			
			for (int i = 0 ; i < vectorG.length ; i++){
			
				if (vectorG[i] % 2 == 0){
				
					vectorH[j] = vectorG[i];
					j++; 
				
				}
			
			}
			
			System.out.println("\n\tThe even elements are:\n");
			
			for (int element : vectorH){
			
				System.out.print(" " + element);
			
			}
		} else {
		
			System.out.println("\n There are no even elements in this vector.");
		
		}
		
		sc.close();
	}
}


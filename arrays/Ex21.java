//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex21 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int ab[];
		
		ab = new int[10];
		
		System.out.println(" Enter 10 elements\n");
		
		for(int i = 0; i < ab.length; i++){
		
			System.out.print("Enter the element #" + i + ": ");
			ab[i] = sc.nextInt();
		}
		
		for(int i = 0; i < ab.length; i++){
		
			if (ab[i] % 2 != 0){
				
				ab[i] = ab[i] * 2;
			
			}
			
		}
		
		System.out.print("\n Vetor AB:");
		for(int element : ab){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


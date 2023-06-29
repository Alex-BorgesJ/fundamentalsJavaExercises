//Alex Borges da SIlva Junior

import java.util.Scanner; 

public class Ex02 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] vectorB = new int[15];
		
		System.out.println("\n\tEnter with 15 intergers elements\n");
		
		for (int i = 0; i < vectorB.length; i++){
		
			System.out.print(" Enter #" + i + " element: ");
			vectorB[i] = sc.nextInt();
		
		}
		
		System.out.println();
		
		for (int i = vectorB.length -1; i >= 0; i--){
		
			System.out.print(vectorB[i] + " ");
		
		}
		
		sc.close();
	}
}


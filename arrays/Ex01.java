//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex01 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vectorA[] = new int [15];
		
		System.out.print("\n\tEnter with 15 intergers elements\n");
		
		for (int i = 0; i < vectorA.length; i++){
		
			System.out.print(" Enter #" + i + " element: ");
			vectorA[i] = sc.nextInt();
		
		}
		
		System.out.println();
		
		for(int element : vectorA){
		
		System.out.print(element + " ");
		
		}
		
		sc.close();
	}
}


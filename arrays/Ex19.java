//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex19 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int z[], aux = 0;
		
		z = new int[10];
		
		System.out.println(" Enter 10 elements\n");
		
		for(int i = 0; i < z.length; i++){
		
			System.out.print("Enter the element #" + i + ": ");
			z[i] = sc.nextInt();
		}
		
		for(int i = 0; i < z.length; i++){
		
			for (int j = i; j < z.length; j++){
			
				if (z[j] < z[i]){
					
					aux = z[i];
					z[i] = z[j];
					z[j] = aux;
					
				} 
			
			}
			
		}
		
		System.out.print("\n Vetor Z:");
		for(int element : z){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


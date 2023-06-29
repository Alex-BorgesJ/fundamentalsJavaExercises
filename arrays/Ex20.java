//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex20 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int aa[], aux = 0;
		
		aa = new int[10];
		
		System.out.println(" Enter 10 elements\n");
		
		for(int i = 0; i < aa.length; i++){
		
			System.out.print("Enter the element #" + i + ": ");
			aa[i] = sc.nextInt();
		}
		
		for(int i = 0; i < aa.length; i++){
		
			for (int j = i; j < aa.length; j++){
			
				if (aa[j] > aa[i]){
					
					aux = aa[i];
					aa[i] = aa[j];
					aa[j] = aux;
					
				} 
			
			}
			
		}
		
		System.out.print("\n Vetor AA:");
		for(int element : aa){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


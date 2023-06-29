//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex24 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int ae[], aux = 0;
		
		ae = new int[5];
		
		System.out.println(" Enter the values of the elements in vector AE");
		
		for(int i = 0; i < ae.length; i++){
		
			System.out.print("Enter the value #" + i + ": ");
			ae[i] = sc.nextInt();
		
		}
		
		for (int i = 0; i < ae.length; i++){
			
			if (ae[i] % 2 != 0){
				for (int j = i; j < ae.length; j++){
				
					if (ae[j] % 2 != 0 && ae[j] < ae[i]){
						aux = ae[i];
						ae[i] = ae[j];
						ae[j] = aux;	
					}
				
				}
			}
		}
		
		System.out.print("\n Vector AE:");
		for (int element : ae){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex25 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int af[], aux = 0;
		
		af = new int[10];
		
		System.out.println(" Enter the values of the elements in vector AF");
		
		for(int i = 0; i < af.length; i++){
		
			System.out.print("Enter the value #" + i + ": ");
			af[i] = sc.nextInt();
		
		}
		
		for (int i = 0; i < af.length; i++){
			
			if (af[i] % 2 != 0){
				for (int j = i; j < af.length; j++){
					if (af[j] % 2 != 0 && af[j] < af[i]){
						aux = af[i];
						af[i] = af[j];
						af[j] = aux;	
					}
				}
			} else {
				for (int j = i; j < af.length; j++){
					if (af[j] % 2 == 0 && af[j] > af[i]){
						aux = af[i];
						af[i] = af[j];
						af[j] = aux;	
					}
				}
			}
			
			
		}
		
		System.out.print("\n Vector AF:");
		for (int element : af){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


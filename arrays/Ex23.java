//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex23 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int ad[], aux = 0;
		
		ad = new int[5];
		
		System.out.println(" Enter the values of the elements in vector AD");
		
		for(int i = 0; i < ad.length; i++){
		
			System.out.print("Enter the value #" + i + ": ");
			ad[i] = sc.nextInt();
		
		}
		
		for (int i = 0; i < ad.length; i++){
			
			if (ad[i] % 2 == 0){
				for (int j = i; j < ad.length; j++){
				
					if (ad[j] % 2 == 0 && ad[j] < ad[i]){
						aux = ad[i];
						ad[i] = ad[j];
						ad[j] = aux;	
					}
				
				}
			}
		}
		
		System.out.print("\n Vector AD:");
		for (int element : ad){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


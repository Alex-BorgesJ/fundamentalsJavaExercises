//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex22 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int ac[], limit = 0, n = 0;
		
		do{
		
			System.out.print(" Enter the number of positions: ");
			n = sc.nextInt();
			
		} while (n <= 0 || n > 20);
		
		ac = new int[n];
		
		System.out.print("\n Define the limit for the size of elements (valid value for both negative and positive numbers): ");
		limit = sc.nextInt();
		
		System.out.println("\n Enter the values of the elements in vector AC");
		
		for (int i = 0; i < ac.length; i++){
		
			do{
			
				System.out.print(" Enter  the value #" + i + ": ");
				ac[i] = sc.nextInt();
			
				if (ac[i] < -limit || ac[i] > limit){
				
					System.out.println("\tERROR! Value outside of the limit, try again.");
				
				}
			
			} while (ac[i] < -limit || ac[i] > limit);
		
		}
		
		System.out.print("\n Vector AC: ");
		for (int element : ac){
			System.out.print(" " + element); 
	}
		
		sc.close();
	}
}


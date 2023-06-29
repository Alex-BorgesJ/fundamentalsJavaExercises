//Alex Botges da Silva Junior

import java.util.Scanner;

public class Ex14 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int s[], t[], u[], length = 0, aux = 0;
		
		s = new int[10];
		t = new int[15];
		length = s.length + t.length;
		u = new int[length];
		
		System.out.println(" Provide the elements of vector S\n");
		
		for(int i = 0; i < s.length; i++){
		
			System.out.print(" Enter the element #" + i + ": ");
			s[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector S: ");
		
		for (int element : s){
			System.out.print(" " + element);
		}
		
		System.out.println("\n\n Provide the elements of vector T\n");
		
		for(int i = 0; i < t.length; i++){
		
			System.out.print(" Enter the element #" + i + ": ");
			t[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector T: ");
		
		for (int element : t){
				System.out.print(" " + element);
		}
		
		for (int i = 0; i < t.length; i++){
		
			if(i < s.length){
			 u[aux] = s[i];
			 aux++;
			}
			
			u[aux] = t[i];
			aux++; 
		
		}

		
		System.out.print("\n\n Vector U: ");
		
		for (int element : u){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


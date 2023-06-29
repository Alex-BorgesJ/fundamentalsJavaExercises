//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex15 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int s[], t[], u[], length = 0, aux = 0; 
		
		do {
		
			System.out.print(" Enter the length of vector S: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 10);
		
		s = new int [length];
		
		System.out.println("\n\n Enter the elements of vector S ");
		
		for (int i = 0; i < s.length; i++){
		
			System.out.print(" Enter the integer value of element #" + i + ": ");
			s[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector S: ");
		for (int element : s){
			System.out.print(" " + element);
		}
		
		System.out.println("\n");
		
		do {
		
			System.out.print(" Enter the length of vector T: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 15);
		
		t = new int [length];
		
		System.out.println("\n\n Enter the elements of vector T ");
		
		for (int i = 0; i < t.length; i++){
		
			System.out.print(" Enter the integer value of element #" + i + ": ");
			t[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector T: ");
		for (int element : t){
			System.out.print(" " + element);
		}
		
		u = new int[s.length + t.length];
		
		if (s.length > t.length){
			
			for (int i = 0; i < s.length; i++){
				
				u[aux] = s[i];
				aux++;
				if (i < t.length){
					u[aux] = t[i];
					aux++;
				}
			} 
		} else if (s.length == t.length){
			
			for (int i = 0; i < s.length; i++){
				
				u[aux] = s[i];
				aux++;				
				u[aux] = t[i];
				aux++;
			
			}
		} else {
		
			for (int i = 0; i < t.length; i++){
			
				if (i < s.length){
					u[aux] = s[i];
					aux++;
				}
				u[aux] = t[i];
				aux++;
				
			}
		
		}
		
		System.out.print("\n\n Vector U: ");
		for (int element : u){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


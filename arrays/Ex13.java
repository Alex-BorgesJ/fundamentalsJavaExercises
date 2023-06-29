//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int p[], q[], r[], length = 0; 
		
		do {
		
			System.out.print(" Enter the length of vector P: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 10);
		
		p = new int [length];
		
		System.out.println("\n\n Enter the elements of vector P ");
		
		for (int i = 0; i < p.length; i++){
		
			System.out.print(" Enter the integer value of element #" + i + ": ");
			p[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector P: ");
		for (int element : p){
			System.out.print(" " + element);
		}
		
		System.out.println("\n");
		
		do {
		
			System.out.print(" Enter the length of vector Q: ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 15);
		
		q = new int [length];
		
		System.out.println("\n\n Enter the elements of vector Q ");
		
		for (int i = 0; i < q.length; i++){
		
			System.out.print(" Enter the integer value of element #" + i + ": ");
			q[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector Q: ");
		for (int element : q){
			System.out.print(" " + element);
		}
		
		r = new int[p.length + q.length];
		
		for (int i = 0; i < p.length; i++){
			r[i] = p[i];
		}
		for (int i = 0; i < q.length; i++){
			r[i + p.length] = q[i];
		}
		
		System.out.print("\n\n Vector R: ");
		for (int element : r){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


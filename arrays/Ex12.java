//Alex Botges da Silva Junior

import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int p[], q[], r[], length = 0;
		
		p = new int[10];
		q = new int[15];
		length = p.length + q.length;
		r = new int[length];
		
		System.out.println(" Provide the elements of vector P\n");
		
		for(int i = 0; i < p.length; i++){
		
			System.out.print(" Enter the element #" + i + ": ");
			p[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector P: ");
		
		for (int element : p){
			System.out.print(" " + element);
		}
		
		System.out.println("\n\n Provide the elements of vector Q\n");
		
		for(int i = 0; i < q.length; i++){
		
			System.out.print(" Enter the element #" + i + ": ");
			q[i] = sc.nextInt();
		
		}
		
		System.out.print("\n Vector Q: ");
		
		for (int element : q){
				System.out.print(" " + element);
		}
		
		for (int i = 0; i < p.length; i++){
		
			r[i] = p[i];	
		
		}
		for (int i = 0; i < q.length; i++){
		
			r[p.length + i] = q[i];
		
		}
		
		System.out.print("\n\n Vector R: ");
		
		for (int element : r){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


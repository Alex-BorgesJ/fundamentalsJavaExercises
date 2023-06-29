//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qa[], qb[], qc[], aux = 0;
		
		qa = new int[5];
		qb = new int[5];
		qc = new int[10];
		
		System.out.println("\n Provide the elements of vector qa:\n");
		
		for (int i = 0; i < qa.length; i++){
		
			System.out.print(" Enter the element #" + i +": ");
			qa[i] = sc.nextInt();
		
		}
		
		System.out.println("\n Provide the elements of vector qb:\n");
		
		for (int i = 0; i < qb.length; i++){
		
			System.out.print(" Enter the element #" + i +": ");
			qb[i] = sc.nextInt();
		
		}
		
		for(int i = 0; i < qa.length; i++){
		
			
			qc[aux] = qa[i];
			aux++;
			qc[aux] = qb[i];
			aux++;
		}
		
		System.out.print("\nQA: ");
		
		for (int element : qa){
		
			System.out.print(" " + element);
		
		}
		
		System.out.print("\nQB: ");
		
		for (int element : qb){
		
			System.out.print(" " + element);
		
		}
		
		System.out.print("\nQC: ");
		
		for (int element : qc){
		
			System.out.print(" " + element);
		
		}
		
		sc.close();
	}
}


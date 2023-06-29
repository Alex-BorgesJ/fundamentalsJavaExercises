//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pa[], pb[], pc[];
		
		pa = new int[5];
		pb = new int[5];
		pc = new int[10];
		
		System.out.println("\n Provide the elements of vector pa:\n");
		
		for (int i = 0; i < pa.length; i++){
		
			System.out.print(" Enter the element #" + i +": ");
			pa[i] = sc.nextInt();
		
		}
		
		System.out.println("\n Provide the elements of vector pb:\n");
		
		for (int i = 0; i < pb.length; i++){
		
			System.out.print(" Enter the element #" + i +": ");
			pb[i] = sc.nextInt();
		
		}
		
		for(int i = 0; i < pa.length; i++){
		
			pc[i] = pa[i];
		
		}
		
		for (int i = 0; i < pb.length; i++){
		
			pc[i + pa.length] = pb[i];
		
		}
		
		System.out.print("\nPA: ");
		
		for (int element : pa){
		
			System.out.print(" " + element);
		
		}
		
		System.out.print("\nPB: ");
		
		for (int element : pb){
		
			System.out.print(" " + element);
		
		}
		
		System.out.print("\nPC: ");
		
		for (int element : pc){
		
			System.out.print(" " + element);
		
		}
		
		sc.close();
	}
}


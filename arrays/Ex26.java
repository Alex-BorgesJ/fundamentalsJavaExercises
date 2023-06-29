//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex26 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int ag[], aux = 0, cont = 0;
		
		ag = new int[10];
		
		System.out.println(" Enter the values of the elements in vector AG");
		
		for(int i = 0; i < ag.length; i++){
		
			System.out.print("Enter the value #" + i + ": ");
			ag[i] = sc.nextInt();
		
		}
		
		for (int i = 0; i < ag.length; i++){
			
			aux = ag[i];
			cont = 0;
			while (aux > 0){
				if (ag[i] % aux == 0){
					cont++;
				}
				aux--;
			}
			
			if (cont == 2){
				for (int j = i; j < ag.length; j++){
					aux = ag[j];
					cont = 0;
					while (aux > 0){
						if (ag[j] % aux == 0){
							cont++;
						}
						aux--;
					}
					
					if (cont == 2){
						if (ag[i] > ag[j]){
							aux = ag[i];
							ag[i] = ag[j];
							ag[j] = aux;
						}
					}
				}
			}
			
		}
		
		System.out.print("\n Vector AG:");
		for (int element : ag){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


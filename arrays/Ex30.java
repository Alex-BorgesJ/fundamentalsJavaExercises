//Alex Borges da SIlva Junior

import java.util.Scanner;
import java.util.Arrays;

public class Ex30{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double ak[], al[];
		int length = 0, aux = 0, quantMedia = 0;
		
		do{
			System.out.print("Quantidade de elemnntos do vetor AK: ");
			length = sc.nextInt();
		} while (length <= 0);
		
		ak = new double[length];
		
		System.out.println("\tInforme os elementos do vetor AK");
		
		for (int i = 0; i < ak.length; i++){
			System.out.print("Elemento #" + i + ": ");
			ak[i] = sc.nextDouble();
		}
		
		Arrays.sort(ak);
		
		quantMedia = length - 1;
		al = new double[((length*2) - 1)];
		
		for(int i =0; i < ak.length; i++){
			
			al[aux] = ak[i];
			aux++;
			if (quantMedia >  0){
				quantMedia--;
				al[aux] = (ak[i+1] + ak[i]) / 2; 
				aux++; 
			}
			
		}
		
		System.out.print("\n\tVetor AL:");
		boolean prime = true;
		
		for (double f : al){
			if(prime){
				System.out.print(" " + f);
				prime = false;
			}else {
				System.out.print(", " + f);
			}
		}
		
		sc.close();
	}
}


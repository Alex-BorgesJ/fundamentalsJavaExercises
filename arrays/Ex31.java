//Alex Borges da SIlva Junior

import java.util.Scanner; 
import java.util.Arrays;

public class Ex31 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		int n = 0;
		String strings[];
		
		do{
			System.out.print("Informe o tamanho do vetor AM: ");
			n = scNum.nextInt();
		} while (n <= 0 || n > 10);
		
		strings = new String[n];
		
		System.out.println("\tInforme as strings para registro no vetor AM");
		
		for(int i = 0; i < strings.length; i++){
			System.out.print("Informe a string #" + i + ": ");
			strings[i] = scStr.nextLine().toLowerCase(); 
		}
		
		Arrays.sort(strings);
		
		System.out.print("\n\tVetor AM:");
		boolean prime = true;
		for (String element : strings){
				if(prime){
					System.out.print(" \"" + element + "\"");
					prime = false;
				} else {
					System.out.print(", \"" + element + "\"");
				}
		}
		
		scNum.close(); scStr.close();
	}
}


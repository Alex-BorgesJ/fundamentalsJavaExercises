//Alex Borges da SIlva Junior

import java.util.Scanner;
import java.util.Arrays; 

public class Ex32 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase, an[];
		
		System.out.print("Digite uma frase: ");
		frase = sc.nextLine().toLowerCase(); 
		
		frase = frase.trim();
		an = frase.split(" ");
		Arrays.sort(an);
		
		System.out.print("\n\tVetor AN:");
		boolean prime = true;
		for(String palavra : an){
			if (!palavra.isEmpty()){
				if (prime){
					System.out.print(" \"" + palavra + "\"");
					prime = false;
				} else{
					System.out.print(", \"" + palavra + "\""); 
				}
			}
		}
		
		sc.close();
	}
}


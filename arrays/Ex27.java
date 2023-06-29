//Alex Borges da SIlva Junior

import java.util.Scanner;
import java.util.Random;

public class Ex27 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		
		int ah[], ai[], aux = 0, lengthAle = 0;
		
		lengthAle = rand.nextInt(4) + 2;
		
		ai = new int[lengthAle];
		
		for (int i = 0; i < ai.length; i++){
		
			ai[i] = rand.nextInt(76) + 25;
		
		} 
		
		ah = new int[5];
		
		System.out.println(" Enter the values of the elements in vector AH");
		
		for(int i = 0; i < ah.length; i++){
		
			do{
				System.out.print("Enter the value #" + i + ": ");
				ah[i] = sc.nextInt();
				if(ah[i] < 25){
					System.out.println("\nERROR! Try again.");
				}
			} while (ah[i] < 25);
			
		}
		
		boolean contained = true; // Assume que todos os elementos estão contidos

		for (int aiElement : ai) {
			boolean found = false; // Indica se o elemento atual de ai foi encontrado em ah

			for (int ahElement : ah) {
				if (aiElement == ahElement) {
					found = true;
					break; // Elemento encontrado, não é necessário continuar a busca
				}
			}

			if (!found) {
				contained = false;
				break; // Elemento de ai não encontrado em ah, não está contido
			}
		}
		
		int initialPosition = -1;
		
		for (int i = 0; i < ah.length; i++) {
			if (ah[i] == ai[0]) {
				initialPosition = i;
				break;
			}
		}

		if (contained) {
			System.out.println("\nVector AI is contained in vector AH. Position inicial: " + initialPosition);
		} else {
			System.out.println("\nVector AI is not contained in vector AH.");
		}
		
		sc.close();
	}
}


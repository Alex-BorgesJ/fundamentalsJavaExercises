///Alex Borges da Silva Junior

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex29 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Random randElement = new Random();
		
		int aj[], length =0, guessNumber = 0, attempt = 1;
		boolean correct = false;
		
		do{
			System.out.print("Define the length of vector AJ(>=10): ");
			length = sc.nextInt();
		} while (length < 10);
		
		aj = new int[length];
		
		for(int i = 0; i < aj.length; i++){
			int aux = i;
			
			if ( i > 0){
				do{
					aj[i] = randElement.nextInt(1001);
					aux--;
				} while (aj[i] == aj[aux] || aux>0);
			} else {
				aj[i] = randElement.nextInt(1001);
			}
		}
		
		Arrays.sort(aj);
		
		System.out.print("\tProvide an integer number that you think exists in AJ. There are 10 attemps\n");
		
		do {
			System.out.print("Provide a number, attempt #" + attempt + ": ");
			guessNumber = sc.nextInt();
			
			for (int i = 0; i < aj.length; i++){
				if (aj[i] == guessNumber){
					correct = true; 
					break;
				}
			}
			
			if (correct){
				break;
			} else{
				if (attempt < 10) System.out.println("\tWrong! Try again.");
				attempt++; 
			}
		} while (attempt <= 10 );
		
		if (correct){
			System.out.print("\n\tVector AJ:");
			for(int ajElement : aj){
				System.out.print(" " + ajElement);
			}
			int position = 0;
			for (int i = 0; i < aj.length; i++){
				if (aj[i] == guessNumber){
					position = i;
				}
			}
			System.out.println("\n\tYou got it right, congratulations! It was at position " + position);
		} else {
			System.out.println("\n\tYour attempts have ended, I'm sorry.");
		}
		
		sc.close();
	}
}


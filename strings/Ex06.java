//Alex Borges da SIlva Junior 

import java.util.Scanner;

public class Ex06 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String phrase = "";
		int cont = 0;
		char character;
		
		System.out.print("Enter with a character: ");
		character = sc.nextLine().charAt(0);
		System.out.print("Enter with a phrase: ");
		phrase = sc.nextLine();
		
		for (int i = 0; i < phrase.length(); i++){
			
			if (phrase.charAt(i) == character || phrase.charAt(i) == character){
				
					cont++;
				
				}
			
			}
			
			System.out.printf("The phrase contains %d characters '%s'.", cont, character);
		
		sc.close();
	}
}


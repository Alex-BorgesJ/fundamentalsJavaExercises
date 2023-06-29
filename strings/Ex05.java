//Alex Borges da SIlva Junior 

import java.util.Scanner;

public class Ex05 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String phrase = "";
		int cont = 0;
		
		System.out.print("Enter with a phrase: ");
		phrase = sc.nextLine();
		
		for (int i = 0; i < phrase.length(); i++){
			
			if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A'){
				
					cont++;
				
				}
			
			}
			
			System.out.printf("The phrase contains %d characters 'a'.", cont);
		
		sc.close();
	}
}


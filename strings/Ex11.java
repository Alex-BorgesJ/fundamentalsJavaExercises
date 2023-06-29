//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex11 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in); 
			
			String phrase = "";
			int contAlfa = 0, contNum = 0;
			
			System.out.print("Enter with a phrase: ");
			phrase = sc.nextLine();
			
			for (int i = 0; i < phrase.length(); i++){
				
					for (char j = 'A'; j <= 'Z'; j++){
						
							contAlfa += (phrase.toUpperCase().charAt(i) == j ? 1 :  0);
						
						}
						
						for (char j = '0'; j <= '9'; j++){
							
							contNum += (phrase.charAt(i) == j ? 1 : 0);
							
							}
				
				}
				
				System.out.println();
				System.out.printf("The sentence contains %d alphabetic characters and %d numeric digits.", contAlfa, contNum); 
			
			sc.close(); 
	}
}


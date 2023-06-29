//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String text ="", alphabet = "", vowels = "aeiou";
			
			for (char alpha = 'a'; alpha <= 'z'; alpha++){
				
					if ( !vowels.contains(String.valueOf(alpha))){
						
							alphabet += alpha;
						
						}
				
				}
			
			alphabet = alphabet + alphabet.toUpperCase();


			System.out.print("Enter the text you want: ");
			text = sc.nextLine();
			
			int contC = 0;
			
			for (int i = 0; i < text.length(); i++ ){
				
				if ( alphabet.contains(String.valueOf(text.charAt(i)))){
					
						contC++;
					
					}
				
				} 
				
				System.out.println();
				System.out.printf("The provided text has %d consonant letters.", contC);
			
			sc.close();
	}
}


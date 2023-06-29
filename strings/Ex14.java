//Alex Borges da Silva Junior 

import java.util.Scanner; 

public class Ex14 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String sentence;
			char character;
			
			System.out.print("Enter a sentence: ");
			sentence = sc.nextLine();
			System.out.print("Enter a character: ");
			character = sc.next().charAt(0);
			character = Character.toUpperCase(character);
			
			for (int i = 0; i < sentence.length(); i++){
				
					if (sentence.toUpperCase().charAt(i) == character){
						
							sentence = sentence.replace(sentence.charAt(i), '*');
						
						}
				
				}
				
				System.out.println();
				System.out.println("\t" + sentence);
			
			sc.close();
	}
}


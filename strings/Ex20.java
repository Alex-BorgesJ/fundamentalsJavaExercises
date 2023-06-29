//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex20 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String sentence = "", words[];
			char space = ' ';
			int numWords = 0;
			
			System.out.print("Enter a sentence: ");
			sentence = sc.nextLine();
			words = sentence.split(" ");
			
			for ( String element : words) {
				
					if ( !element.isEmpty() ) {
						
							numWords++;
						
						} 
				
				}
			
			System.out.println();
			System.out.println("The sentence has " + numWords + " words"); 
			
			sc.close();
	}
}


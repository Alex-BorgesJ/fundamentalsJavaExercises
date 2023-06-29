//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex22 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in); 
			
			String sentence = "", word = "";
			int cont = 0, index = 0;
			
			System.out.print("Enter a sentence: ");
			sentence = sc.nextLine(); 
			
			System.out.print("Enter a word: ");
			word = sc.next();
			
			index = sentence.toLowerCase().indexOf(word.toLowerCase());
			
			while (index != -1) {
				
					if ( index != -1){
						
							cont++;
							index = sentence.toLowerCase().indexOf(word.toLowerCase(), index + 1);
						}
				
				} 
			
				System.out.println();
				System.out.println("\t The word occurs " + cont + " times in the sentence." );
			
			sc.close();
	}
}


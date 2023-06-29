//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex21 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in); 
			
			String sentence = "", out = "", words[];
			
			System.out.print("Enter a sentence: ");
			sentence = sc.nextLine();
			
			words = sentence.split(" ");
			
			for (int i = 0; i < words.length; i++){
				
					if (! words[i].isEmpty()){
						
							out += words[i] + " | " ;
						
						}
				
				}
				
				System.out.println();
				System.out.println(out);
			
			sc.close();
	}
}


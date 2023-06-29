//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex10 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String phrase = "";
			int cont = 0;
			
			System.out.print("Enter with a phrase: ");
			phrase = sc.nextLine();
			
			for (int i = 0; i < phrase.length(); i++){
				
					for(char j = 'A'; j <= 'Z'; j++){
						
						cont += ( phrase.charAt(i) == j ? 1 : 0);
						
						}
				
				}
			
			System.out.println();
			System.out.printf("There are %d
			 uppercase characters in this sentence.", cont);
			
			sc.close();
	}
}


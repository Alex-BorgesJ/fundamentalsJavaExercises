//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex09 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String phrase = "";
			int cont = 0;
			
			System.out.print("Enter with a phrase: ");
			phrase = sc.nextLine();
			
			for (int i = 0; i < phrase.length(); i++){
				
					if (phrase.charAt(i) == ' '){
						
							cont++;
						
						}
				
				}
			
			System.out.println();
			System.out.printf("There are %d white spaces in this sentence.", cont);
			
			sc.close();
	}
}


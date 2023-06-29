///Alex Borges da SIlva Junior

import java.util.Scanner; 

public class Ex08 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
				String phrase = "";
				String table = "";
				
			System.out.print("Enter with a phrase: ");
			phrase = sc.nextLine();
			
			for (char i = 'A'; i <= 'Z'; i++){
				
				int cont = 0;
				
					for(int j = 0; j < phrase.length(); j++){
						
							if ( phrase.toUpperCase().charAt(j) == i){
							
								cont++;
							
							}
						
						}
				if (cont > 0){
					table += "\tThe character | " + i + " | appears | " + cont + " | times in the sentence.\n";
				}
				}
				
				System.out.println();
				System.out.println(table); 
			
			sc.close();
	}
}


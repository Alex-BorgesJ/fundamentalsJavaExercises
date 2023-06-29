//Alex Borges da SIlva Junior

import java.util.Scanner; 

public class Ex24 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String sequence = "", validChar = "01";
			int cont = 1,longestSequence=0;
			boolean validSequence = true;
			
			do {
				
					System.out.print("Enter a sequence(only 0's and 1's): ");
					sequence = sc.nextLine();
					
					validSequence = true;
					
					for (int i = 0; i < sequence.length(); i++){
						
						if ( !validChar.contains(String.valueOf(sequence.charAt(i))) ){
						
							validSequence = false;
							break;
							
						}
					}
				
				} while (!validSequence);
			
			for (int i = 0; i < sequence.length(); i++, cont++){
				
					if(sequence.charAt(i)=='0'){
						cont=0;
					}
					
					longestSequence=( ( cont > longestSequence ) ? cont : longestSequence ) ;
					
				}
			
			System.out.println("\n\tThe longest sequence of 1's has a length of " + longestSequence);
			
			sc.close();
	}
}


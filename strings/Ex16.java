//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex16 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String text = "", alphabet = "", textWithOutSpaces = "";
			boolean upperCaseOnly = true;
			
			for (char a = 'A'; a <= 'Z'; a++){
				
					alphabet += a;
				
				} 
				
				System.out.print("Enter a sentence: ");
				text = sc.nextLine(); 
				
				textWithOutSpaces = text.replaceAll(" ", "");
				
				for (int i = 0; i < textWithOutSpaces.length(); i++){
					
						if ( !alphabet.contains( String.valueOf( textWithOutSpaces.charAt(i) ) )) {
							
								upperCaseOnly = false;
							
							}
					
					}
			
			System.out.println();
			
			if (upperCaseOnly){
				
					System.out.println("\tThe sentence contains only uppercase letters.");
				
				} else {
					
						System.out.println("\t	The sentence does not contains only uppercase letters.");
					
					}
			
			sc.close();
	}
}


//Alex Borges da Silva Junior

import java.util.Scanner;

public class Ex25 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String password = "", alphabet = "", number = "0123456789", specialsChar = "!@#$%&*()+"; 
		int length, contLetters = 0,contAlphabetUpper=0,contAlphabetLower=0, contNumber=0, contSpecialsChar=0;
		boolean valid = false; 
		
		for (int i = 'A';i <= 'Z';i++){
			alphabet += (char)i;
		}
		
		while (!valid){
			
				System.out.print("Password: ");
				password = sc.nextLine();
				
				length = password.length();
				contLetters = 0; 
				contAlphabetUpper = 0 ;
				contAlphabetLower = 0;
				contNumber = 0;
				contSpecialsChar = 0;
				
				for (int i = 0; i < password.length(); i++){
				
					char c = password.charAt(i);
					
					if (alphabet.indexOf(c) != -1){
					
						contAlphabetUpper++;
					
					} else if ( alphabet.toLowerCase().indexOf(c) != -1 ){
						
						contAlphabetLower++;
					
					} else if ( number.indexOf(c) != -1 ){
						
						contNumber++;
						
					} else if (specialsChar.indexOf(c) != -1){
							
						contSpecialsChar++;
							
					} else {
						System.out.println("Invalid character! Try again.");
						valid = false;
						break;
					}

				}
				
				contLetters = contAlphabetLower + contAlphabetUpper;
				
				System.out.println();
				System.out.println ("Rules: ");
				System.out.println("Length 10: " + length + (length >= 10 ? " (OK)" : " (X)"));
				System.out.println("Letters 3: " + contLetters + (contLetters >= 3 ? " (OK)" : " (X)"));
				System.out.println("Numbers 3: " + contNumber + (contNumber >= 3 ? " (OK)" : " (X)"));
				System.out.println("Symbols 2: " + contSpecialsChar + (contSpecialsChar >= 2 ? " (OK)" : " (X)"));
				
				System.out.println();
				if (contAlphabetUpper > 0 && contAlphabetLower > 0 && length >= 10 
					&& contLetters >= 3 && contNumber >= 3 && contSpecialsChar >= 2){
						
					valid = true;
					System.out.println("Valid password! Congratulations!");
					
				} else {
					
					System.out.println("Invalid password! Try again.");
					
					}
							
			}
		
		sc.close();
	}
}

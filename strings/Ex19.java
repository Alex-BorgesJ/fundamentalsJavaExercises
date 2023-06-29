//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex19 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String word = "", reverseWord = "";
			
			System.out.print("Enter a word: ");
			word = sc.next();
			
			for (int c = word.length() - 1; c >= 0; c--){
				
					reverseWord += word.charAt(c);
				
				}
				
				System.out.println();
				
				if (word.equals(reverseWord)){
					
						System.out.println("It is a palindrome");
					
					} else {
						
							System.out.println("It is not a palindrome");
						
						}
			
			sc.close();
	}
}


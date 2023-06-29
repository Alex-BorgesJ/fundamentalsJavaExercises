//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex17 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String sentence1= "", sentence2 = ""; 
			
			System.out.print("Entre a sentence: ");
			sentence1 = sc.nextLine();
			System.out.print("Enter another sentence: ");
			sentence2 = sc.nextLine();
			
			System.out.println();
			
			if(sentence1.equals(sentence2)){
				
					System.out.println("The sentences match!");
				
				} else {
					
					System.out.println("The sentences do not match!");
					
					}
			
			sc.close(); 
	}
}


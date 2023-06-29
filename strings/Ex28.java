//Alex Borges da SIlva Junior

import java.util.Scanner; 

public class Ex28 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String input = "", halfOfInput1 = "", halfOfInput2 = "", halfOfInput2Recversed = "", out = "";
		int half;
			
		System.out.print("Enter a string: ");
		input = sc.nextLine();
		input = input.trim();
		half = input.length() / 2;
		
		halfOfInput1 = input.substring(0, half);
		halfOfInput2 = input.substring(half);
		
		for (int i = halfOfInput2.length() - 1; i >= 0; i--){
		
			halfOfInput2Recversed += halfOfInput2.charAt(i);
		
		}
		
		for (int i = 0; i < half; i++) {
            out += halfOfInput1.charAt(i) + "" + halfOfInput2Recversed.charAt(i);
        }

        if (input.length() % 2 == 1) {
            out += halfOfInput1.charAt(half-1);
        }
		
		System.out.println("Output: " + out); 
		
		sc.close();
	}
}


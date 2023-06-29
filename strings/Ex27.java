//alex Borges da Silva Junior 

import java.util.Scanner;

public class Ex27 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String input1 = "", input2 = "", unionOfChar = "";
		
		System.out.print("Enter a string: ");
		input1 = sc.nextLine();
		System.out.print("Enter another string: ");
		input2 = sc.nextLine();
		
		input1 = input1.trim();
		input2 = input2.trim();
		
		if (input1.length() == input2.length() ) {
		
			for (int i = 0; i < input1.length(); i++){
			
				unionOfChar += input1.charAt(i);
				unionOfChar += input2.charAt(i);
			
			}
			
			System.out.println("OUT: " + unionOfChar);
		
		} else {
			
			System.out.println("Error! Inputs with different lengths");
			
			}
		
		sc.close();
	}
}


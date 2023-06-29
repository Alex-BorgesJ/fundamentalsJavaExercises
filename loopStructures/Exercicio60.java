//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio60 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the first term of Ricci sequence: ");
		int term1 = scNum.nextInt();
		System.out.print("Enter the second term of Ricci sequence: ");
		int term2 = scNum.nextInt();
		System.out.print("Enter a number and find out if it belongs to the Ricci sequence: ");
		int num = scNum.nextInt();
		boolean found = false;
		
		while (term2 <= num){
			
			if (num == term2){
					found = true;
				}
			
			int nextTerm = term1 + term2;
			term1 = term2; 
			term2 = nextTerm;
			
			}
		 
		if (found){
				System.out.print("This number belongs to the Ricci sequence!");
			} else {
				System.out.print("This number does not belong to the Ricci sequence!");
				}
		
		scNum.close();
	}
}


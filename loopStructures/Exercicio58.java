//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio58 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the first term of Ricci sequence: ");
		int term1 = scNum.nextInt();
		System.out.print("Enter the second term of Ricci sequence: ");
		int term2 = scNum.nextInt();
		boolean prime = true;
		
		for (int i =  1; i <=10; i++){
			
			if (prime){
					System.out.print(term1);
					prime = false;
				}else {
					System.out.print(", " + term1);
					}
					
				int nextTerm = term1 + term2;
				term1 = term2;
				term2 = nextTerm;  
			
			}
		
		scNum.close();
	}
}


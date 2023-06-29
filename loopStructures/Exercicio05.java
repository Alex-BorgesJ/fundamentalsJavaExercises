//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		int n; 
		
		do{
			
			System.out.print("Informe um valor N, maior que zero: ");
			n = scNum.nextInt(); 
			
		} while (n <  0);
		
		for (int i = 1; i <= n; i++){
			
			System.out.print(i + " ");
			
			}
		
		scNum.close(); 
	}
}


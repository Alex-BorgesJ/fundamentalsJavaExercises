//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe um valor N, maior que zero: ");
		int n = scNum.nextInt(); 
		
		for (int i = 1; i <= n; i++){
			
			System.out.print(i + " ");
			
			}
		
		scNum.close(); 
	}
}


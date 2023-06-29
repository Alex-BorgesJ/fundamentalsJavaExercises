//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio05{
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in); 
		
		System.out.print("Informe o ano atual: ");
		int anoAtual = scNum.nextInt();
		System.out.print("Informe o ano de nascimento: ");
		int anoNasc = scNum.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		if (idade >= 16){
			
			System.out.println("Pode votar!!!"); 
			
			} else{
				
				System.out.println("Nao pode votar!!!"); 
				
				}
		
		scNum.close(); 
	}
}


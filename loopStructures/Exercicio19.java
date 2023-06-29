//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio19 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		Scanner scStr = new Scanner (System.in);
		
		double precoTotalEst = 0;
		double precoMerc = 0;
		int quant = 0;
		boolean repeat = true;
		
		while (repeat == true){
			
			System.out.print("Informe o valor da mercadoria: R$");
			precoMerc = scNum.nextDouble();
			
			precoTotalEst += precoMerc;
			quant++; 
			
			System.out.print("Mais mercadorias (S/N)? ");
			String escolha = scStr.next();
			
			repeat = ((escolha.equalsIgnoreCase("S") || escolha.equalsIgnoreCase("SIM")) ? true : false);
			}
			
			System.out.println();
			System.out.printf("O valor total em estoque e igual a: R$%.2f%n", precoTotalEst);
			System.out.printf("O valor medio de mercadoria e: R$%.2f%n", (precoTotalEst / quant));
			
		
		scNum.close(); scStr.close();
	}
}


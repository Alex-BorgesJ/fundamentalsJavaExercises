//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio18 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		double precoTotalMerc = 0;  
		
		System.out.print("Informe o numero total de mercadorias no estoque: ");
		int quant = scNum.nextInt();
		
		for (int i = 0; i < quant; i++){
			
			System.out.print("informe o valor de cada mercadoria: ");
			double valorMerc = scNum.nextDouble();
			
			precoTotalMerc += valorMerc;
			
			} 
			
			System.out.println();
			System.out.printf("informe  o valor total em estoque R$%.2f%n", precoTotalMerc);
			System.out.printf("A media de valor das mercadorias eh R$%.2f%n", (precoTotalMerc / quant));
		
		scNum.close();
	}
}


//Alex Borges da Silva Junior 

import java.util.Scanner; 

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto 1: ");
		double precoProduto1 = scNum.nextDouble();
		System.out.print("Digite o valor do produto 2: "); 
		double precoProduto2 = scNum.nextDouble();
		
		if ((precoProduto1 >= 1 & precoProduto1 <= 1000) && (precoProduto2 >= 1 & precoProduto2<= 1000) ){
			
			if (precoProduto1 <  precoProduto2){
				
				System.out.println("O produto 1 e mais barato"); 
				
				} else if (precoProduto1 >  precoProduto2){
				
				System.out.println("O produto 2 e mais barato"); 
				
				} else {
					
					System.out.println("Os precos dos dois produtos sao iguais");
					
					}
			
			} else {
				
				System.out.println("VALOR INVALIDO");
				
				}
		
		scNum.close(); 
	}
}


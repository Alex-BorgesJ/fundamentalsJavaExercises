//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio12{
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Informe o preco do produto: ");
		double precoProduto = scNum.nextDouble();
		System.out.print("Informe o codigo de origem: "); 
		int codOrigem = scNum.nextInt();
		
		double valorFrete = 0.0;
		
		switch (codOrigem){
			
			case 1: 
						System.out.printf("O valor do produto R$%.2f%n",precoProduto);
						System.out.println("Regiao de procedencia: NORTE");
						valorFrete = precoProduto * (10.0 / 100.0); 
						System.out.printf("Valor do frete: R$%.2f%n", valorFrete);
						System.out.printf("Valor total: R$%.2f%n", (precoProduto+valorFrete));
				break;
			case 2: 
			case 5:
			case 9:
						System.out.printf("O valor do produto R$%.2f%n",precoProduto);
						System.out.println("Regiao de procedencia: SUL");
						valorFrete = precoProduto * (3.0 / 100.0); 
						System.out.printf("Valor do frete: R$%.2f%n", valorFrete);
						System.out.printf("Valor total: R$%.2f%n", (precoProduto+valorFrete));
				break;
			case 3: 
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
						System.out.printf("O valor do produto R$%.2f%n",precoProduto);
						System.out.println("Regiao de procedencia: LESTE");
						valorFrete = precoProduto * (1.2 / 100.0); 
						System.out.printf("Valor do frete: R$%.2f%n", valorFrete);
						System.out.printf("Valor total: R$%.2f%n", (precoProduto+valorFrete));
				break;
			case 7:
			case 20: 
						System.out.printf("O valor do produto R$%.2f%n",precoProduto);
						System.out.println("Regiao de procedencia: OESTE");
						valorFrete = precoProduto * (7.3 / 100.0); 
						System.out.printf("Valor do frete: R$%.2f%n", valorFrete);
						System.out.printf("Valor total: R$%.2f%n", (precoProduto+valorFrete));
				break;
			default:
						System.out.printf("O valor do produto R$%.2f%n",precoProduto);
						System.out.println("Regiao de procedencia: IMPORTADO");
						valorFrete = precoProduto * (22.2 / 100.0); 
						System.out.printf("Valor do frete: R$%.2f%n", valorFrete);
						System.out.printf("Valor total: R$%.2f%n", (precoProduto+valorFrete));
				break;
			
			}
		
		scNum.close();
	}
}


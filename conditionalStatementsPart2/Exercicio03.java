//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.println("\t\tTABELA DE PRECOS:");
		System.out.println("\tMenos de uma duzia, o valor da unidade e R$1,30.");
		System.out.println("\tA partir de uma duzia, o valor da unidade e R$1,00.");
		
		System.out.println();
		System.out.print("Informe quantas macas deseja: ");
		int unidMac = scNum.nextInt();
		
		if (unidMac < 0){
			
			System.out.println("VALOR INVALIDO"); 
			System.exit(0); 
			
			}
		
		if (unidMac >= 12){
			
			double precoUnid = 1.0;
			double precoTotal = unidMac *  precoUnid;
			
			System.out.println("O preco total da sua compra sera: R$" + precoTotal); 
			
			} else {
				
			double precoUnid = 1.3;
			double precoTotal = unidMac *  precoUnid;
			
			System.out.printf("O preco total da sua compra sera: R$%.2f", precoTotal); 
							
				}			
		
		scNum.close();
	}
}


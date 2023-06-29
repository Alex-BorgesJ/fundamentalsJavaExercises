//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		double maxValue = 0;
		double mediaValue = 0;
		
		System.out.print("Informe a quantidade de numeros a ser digitada: ");
		int quantidade = scNum.nextInt();
		
		for (int i = 0; i < quantidade; i++){
			
			System.out.print("Informe um numero: ");
			double num = scNum.nextDouble();
			
			if (num > maxValue){
				
				maxValue = num;
				
				}
				
				mediaValue += num;
				
			}
			
			System.out.printf("O maior numero digitado foi %.2f, e a media destes valores tem valor igual a %.2f", maxValue, ( mediaValue / quantidade));
		
		scNum.close();
	}
}


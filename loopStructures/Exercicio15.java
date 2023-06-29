//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		int soma = 0;
		int aux = 0;
		
		System.out.print("Informe um valor inteiro: ");
		int valor1 = scNum.nextInt();
		System.out.print("Informe outro valor inteiro: ");
		int valor2 = scNum.nextInt();

		if (valor1 > valor2){
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
			}
						
			for (int i  = valor1; i <= valor2; i++){
				
			 soma += i; 
				
				}
				
				System.out.println();
				System.out.println("A soma dos valores pertencentes ao intervalo destes valores (incluse os valores) eh igual a: " + soma);
		
		scNum.close(); 
	}
}


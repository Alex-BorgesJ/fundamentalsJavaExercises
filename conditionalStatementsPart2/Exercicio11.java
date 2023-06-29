//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		Scanner scStr = new Scanner (System.in); 
		
		System.out.print("informe um valor numerico: ");
		double num1 = scNum.nextDouble();
		System.out.print("Informe outrovalor numerico: "); 
		double num2 = scNum.nextDouble();
		
		System.out.print("Informe a operacao que deseja realizar? ");
		char operacao = scStr.next().charAt(0);
		
		switch (operacao){
			
			case '+': 
						System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
					break;
			case '-':
						System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
					break;
			case '*':
						System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
					break;
			case '/':
						System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
					break;
			default:
						System.out.println("Operacao invalida!");
						System.exit(0);
					break;
			}
		
		scNum.close(); scStr.close(); 
	}
}


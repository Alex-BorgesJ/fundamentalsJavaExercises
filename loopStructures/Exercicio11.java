//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		System.out.print("Informe o numero de alunos: ");
		int numAlunos = scNum.nextInt();
		
		double [] notas = new double [numAlunos];
		
		for (int i = 0; i < notas.length; i++){
			
			System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
			notas[i] = scNum.nextDouble();
			
			}
			
			double soma = 0;
			
			for (int i = 0; i < notas.length; i++) {
				
				soma += notas[i];
				
				}
			
			double mediaArit = soma / numAlunos;
			
			System.out.println();
			System.out.printf("A media aritmetica destes alunos e: %.1f", mediaArit);
			
		} 
	}


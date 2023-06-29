//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		Scanner scStr = new Scanner (System.in);
		
		System.out.print("Informe a hora de inicio do jogo: ");
		int horaInicio = scNum.nextInt();
		System.out.print("Informe a hora de terminio do jogo: ");
		int horaTermino = scNum.nextInt();
		int crono = 0; 
			
			
		if ((horaInicio >= 0 && horaInicio <= 24) && (horaTermino >= 0 && horaTermino <= 24) ){
					
					
			if (horaInicio == horaTermino){
				
				System.out.print("O jogo durou menos de uma hora (y/n)? ");
				char resposta = scStr.next().charAt(0); 
				
				switch (resposta){
					
					case 'y':
					case 'Y':
					case 's':
					case 'S':
									System.out.println("O jogo durou menos de uma hora!");
									System.exit(0);
						break; 
					case 'n': 
					case 'N':
									System.out.println("Ok!");
						break; 
					default: 
									System.out.println("Opcao invalida");
									System.exit(0);
					}
				
				}
					
					if(horaInicio != horaTermino){
						
							for (int i = horaInicio; i != horaTermino; i++){
						
						if (i == 24){
							i = 0;
							}
												
						crono++; 
						}
						
						} else {
							
							crono  = 24; 
							
							}
							
			System.out.println("O jogo durou " + crono + " horas");
			
			} else {
				
				System.out.println("VALORES INVALIDOS");
				
				}
		
		scNum.close(); scStr.close();  
	}
}


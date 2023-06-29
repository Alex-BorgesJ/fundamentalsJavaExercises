//Alex Borges da SIlva Junior

import java.util.Scanner; 

public class Exercicio09 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		int contDentro = 0;
		int contFora = 0; 
		
		for (int i = 0; i < 10; i++){
			
			System.out.print("Informe um valor: ");
			int numero = scNum.nextInt();
			
			if (numero >= 10 & numero <= 20){
				
				contDentro++;
				
				} else{
					
					contFora++; 
					
					}
			
			}
			
			System.out.println("Foram lidos " + contDentro + " valores no intervalo [10, 20]");
			System.out.println("Foram lidos " + contFora + " valores fora do intervalo [10, 20]");
		
		scNum.close();
	}
}


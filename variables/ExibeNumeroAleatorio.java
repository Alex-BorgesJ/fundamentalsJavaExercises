//Alex Borges da Silva Junior

import java.util.Random; 

public class ExibeNumeroAleatorio {
	
	public static void main (String[] args) {
		
		Random random = new Random (); 
		
		double numeroAleatorio = random.nextDouble(100);
		
		System.out.printf("O numero : %f", numeroAleatorio);  
		
	}
}


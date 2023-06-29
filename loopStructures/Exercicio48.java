//Alex Borges da Silva Junior 

import java.util.Scanner; 

public class Exercicio48 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of terms you want to know: ");
		int quantOfTerms = scNum.nextInt();
		int quant = 0;
		int num = 1;
		
		
		do {
			int cont = 0;
			
			for (int i = num; i >= 1; i--){
				
				cont += (num%i == 0 ? 1 : 0);
			
				}
				
				if (cont == 2){
					
					if ( num == 2){
						System.out.print(num);
						} else {
							System.out.print(", " + num);
							}
					quant++;
				}
			
				num++;
			} while (quant < quantOfTerms);
	}
}


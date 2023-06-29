//Alex Borges da Silva Junior 

import java.util.Scanner; 

public class Exercicio50 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		int quant = 0;
		boolean valid = true;
		int num = 0;
		do {
		System.out.print("Enter the inicial number of sequency: "); 
		num = scNum.nextInt();
		quant = 0;
		for (int i = num; i >= 1; i --){
			quant += (num % i == 0 ? 1 : 0);
			}
			
			valid = (quant == 2 ? false : true); 
			
		} while (valid);
		
		System.out.print("Enter the quantity of terms you want to know: ");
		int quantOfTerms = scNum.nextInt();
		quant = 0;
		boolean prime  = true;
		
		do {
			int cont = 0;
			
			for (int i = num; i >= 1; i--){
				
				cont += (num%i == 0 ? 1 : 0);
			
				}
				
				if (cont == 2){
					
					if (prime){
						System.out.print(num);
						prime = false;
						} else {
							System.out.print(", " + num);
							}
					quant++;
				}
			
				num++;
			} while (quant < quantOfTerms);
	}
}


//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Exercicio57 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of Perfect numbers you want to generate: ");
		int quant = scNum.nextInt();
		int cont = 0;
		int num = 1;
		int sum;
		
		while (cont < quant){
			
			sum = 0;
			
			for (int i = num - 1; i > 0; i-- ){
				if (num % i == 0){
						sum += i;
					}
				}
			
			if (num == sum){
						System.out.print(num + " ");
					cont++; 
					} 
			
			num++;
			}
		
		scNum.close();
	}
}


//Alex Borges da Silva Junior 

import java.util.Scanner;

public class  ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Digite o valor de a: "); 
		int a = scNum.nextInt(); 
		System.out.print("Digite o valor de b: "); 
		int b = scNum.nextInt();
		
		if ((a >= 0 & a <= 1000) & (b>= 0 & b <= 20)) {
		
		if (a > b){
			
			System.out.println("O valor de a e maior que o de b"); 
			
			} else {
				
			System.out.println("O valor de a e menor que o de b");	
				
				}
		
		if (a % b == 0 & b != 0) {
			
			System.out.println("E divisivel"); 
			
			} else {
				
				System.out.println("Nao e divisivel"); 
				
				}
			} else {
				
				System.out.println("VALORES INVALIDOS");
				
				}
		
		scNum.close(); 
	}
}


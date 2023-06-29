//Alex Borges da Silva Junior


public class Exercicio47 {
	
	public static void main (String[] args) {
		
		System.out.println("\tThe prime numbers from 1 to 100"); 
		
		for (int i = 1; i <= 100; i++){
			
			int cont = 0;
			
			for (int j = i; j >= 1; j-- ){
				
				if (i % j == 0){
					
					cont++; 
					
					}
				
				}
			
			if (cont == 2){
				
				System.out.print( i + " "); 
				
				} 
			
			}
		
	}
}


//Alex Borges da Silva Junior

public class Exercicio42 {
	
	public static void main (String[] args) {
		
		for ( int i = 1; i <= 10; i++){
			
			int factorial = 1;
			
			for (int j = i; j >= 1; j--){
				
				factorial *= j;
				
				}
				
				System.out.println("The factorial of " + i + " is equal to: " + factorial);
			
			}
		
	}
}


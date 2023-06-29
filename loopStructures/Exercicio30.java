//Alex Borges da Silva Junior

public class Exercicio30 {
	
	public static void main (String[] args) {
		
		
		for (int i = 1; i <= 10; i++){
			
			System.out.print(i + ", ");
			
			for (int j = i; j <= i*2; j++){
				
				if ( i % 2 != 0){
					
					if ( j % 2 != 0){
						
						System.out.print (j + " ");
					}
					
						} else {
							
					if ( j % 2 == 0){
						
						System.out.print (j + " ");
					}		
							
					}
				}
			
			System.out.println();

			}
		
	}
}


//Alex Borges da Silva Junior

public class Exercicio56 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 900; i++){
			
			int sum = 0;
			
			for (int j = i - 1; j > 0; j--){
				
				if (i % j == 0) {
						sum += j; 
					}
				
				}
			
			if (i == sum){
				
				System.out. print(i + " ");
				
				}
			
			}
		
	}
}


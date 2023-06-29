//Alex Borges da Silva Junior 

public class Exercicio53 {
	
	public static void main (String[] args) {
		
		System.out.println("\tThe Fibonacci numbers that are present in the range from 1 to 250: ");
		
		int term1 = 0;
		int term2 = 1;
		boolean valid = true;
		boolean prime = true;
		
		while (valid){
			
				if (prime){
					System.out.print(term1);
					prime = false;
					} else {
						System.out.print(", " + term1); 
						}
				
				int nextTerm = term1 + term2;
				term1 = term2;
				term2 = nextTerm;
				valid = (term1 >= 250 ? false : true);
			}
		
	}
}


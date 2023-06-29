//Alex Borges da Silva Junior 

public class  ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		int a = (int) (Math.random() * 1000); 
		int b = (int) (Math.random() * 20); 
		
		if (a % b == 0 & b != 0){
			
			System.out.println("E divisivel");
						
			} else {
				
				System.out.println("Nao e divisivel"); 
				
				}
		
	}
}


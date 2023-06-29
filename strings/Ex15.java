//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex15 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in); 
			
			String text = "", numerics = "0123456789";
			boolean itHas = false;
			
			System.out.print("Enter a sentence: ");
			text = sc.nextLine();
			
			for(int i = 0; i < text.length(); i++){
				
					if ( numerics.contains( "" + text.charAt(i) ) ){
						
							itHas = true;
						
						}
				
				}
				
				System.out.println(); 
				
				if (itHas){
					
						System.out.println("\tThe provided text contains numeric characters.");
					
					} else {
						
						System.out.println("\tThe provided text does not contain numeric characters.");
						
						}
			
			sc.close();
	}
}


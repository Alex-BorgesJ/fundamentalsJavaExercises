//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex18 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String bin = "01", sequence = "";
			boolean seq8B = true, only0And1 = true;
			
			System.out.print("Enter a sequence: ");
			sequence =sc.nextLine();
			
			for (int i = 0; i < sequence.length(); i++){
				
					if (!bin.contains( String.valueOf( sequence.charAt(i) ) )) {
						
							only0And1 = false;
							break;
						
						}
				
				}
			
			if ( only0And1) {
				
					seq8B = ( sequence.length() != 8 ? false : true );
				
				} else {
					
					seq8B = false;
					
					}
			
			System.out.println();
			
			if (seq8B){
				
					System.out.println("It is an 8-bit sequence.");
				
				} else {
					
						System.out.println("It is not an 8-bit sequence.");
					
					}
			
			sc.close();
	}
}


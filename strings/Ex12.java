//Alex Borges da Silva Junior

import java.util.Scanner; 

public class Ex12 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String text = "";
			int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
			
			System.out.print("Enter the text you want: ");
			text = sc.nextLine();
			
			for (int i = 0; i < text.length(); i++){
				
				contA += (text.toUpperCase().charAt(i) =='A' ? 1 : 0 );
				contE += (text.toUpperCase().charAt(i) =='E' ? 1 : 0 );
				contI += (text.toUpperCase().charAt(i) =='I' ? 1 : 0 );
				contO += (text.toUpperCase().charAt(i) =='O' ? 1 : 0 );
				contU += (text.toUpperCase().charAt(i) =='U' ? 1 : 0 );
				
				}
				
				System.out.println();
				System.out.printf("\tA -- %d%n", contA );
				System.out.printf("\tE -- %d%n", contE );
				System.out.printf("\tI -- %d%n", contI );
				System.out.printf("\tO -- %d%n", contO );
				System.out.printf("\tU -- %d", contU );
			
			sc.close();
	}
}


//Alex Borges da Silva Junior

public class Ex02 {
	
	public static void main (String[] args) {
			
			String out = ""; 
			
			System.out.println();
			for (char i = 'A'; i <= 'Z'; i++){
				
				out += i + " ";
				
				
				}
				
				System.out.println(out);
				out = "";
				
				for (char i = 'A'; i <='Z'; i++){
					
					out = i + " " + out;
					
					}
					
					System.out.println(out);
	}
}


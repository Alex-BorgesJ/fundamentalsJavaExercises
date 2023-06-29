//Alex Borges da Silva Junior

public class Ex03 {
	
	public static void main (String[] args) {
			
			String out = ""; 
			
			System.out.println();
			for (char i = 'a'; i <= 'z'; i++){
				
				out += i + " ";
				
				
				}
				
				System.out.println(out);
				out = "";
				
				for (char i = 'a'; i <='z'; i++){
					
					out = i + " " + out;
					
					}
					
					System.out.println(out);
	}
}


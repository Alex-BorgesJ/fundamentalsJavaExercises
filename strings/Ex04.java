//Alex Borges da Silva Junior

public class Ex04 {
	
	public static void main (String[] args) {
			
			String out = ""; 
			
			System.out.println();
			for (char i = '0'; i <= '9'; i++){
				
				out += i + " ";
				
				
				}
				
				System.out.println(out);
				out = "";
				
				for (char i = '0'; i <='9'; i++){
					
					out = i + " " + out;
					
					}
					
					System.out.println(out);
	}
}


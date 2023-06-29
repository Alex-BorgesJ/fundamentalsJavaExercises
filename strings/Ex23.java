//Alex Borges da SIlva Junior

import java.util.Scanner; 

public class Ex23 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String fullName = "", lastName = "", name[];
			int i;
			
			System.out.print("Please enter your full name: ");
			fullName = sc.nextLine();
			
			name = fullName.split(" ");
			i = name.length - 1 ; 
			
			while (lastName.isEmpty() && i >= 0) {
				
					lastName = name[i].trim
					();
					i--;
				}
			
			System.out.println();
			System.out.print("The last name is " + lastName);
			
			sc.close();
	}
}


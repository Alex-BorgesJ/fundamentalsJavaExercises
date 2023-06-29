//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex16 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vect[], length = 0, a 	= 0, b = 1, c = 0;
		
		do{
		
			System.out.print(" Enter the numbers of Prime terms you want:  ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 20);
		
		vect = new int[length];
		
		for (int i = 0; i < vect.length; i++){
		
			vect [i] = a;
			c = a + b;
			a = b;
			b = c;
		
		}
		
		System.out.print("\n The Prime terms are:");
		for(int element : vect){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


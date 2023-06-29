//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex18 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vect[], length = 0, term = 1, aux = 0;
		
		do{
		
			System.out.print(" Enter the numbers of Factorials terms you want:  ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 20);
		
		vect = new int[length];
		
		for (int i = 1; i <= vect.length; i++){
		
			term = 1;
			aux = i;
			while ( aux > 1){
				term *= aux;
				aux--;
			}
			
			vect[i - 1] = term;
		
		}
		
		System.out.print("\n The Factorialsi terms are:");
		for(int element : vect){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


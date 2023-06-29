//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex17 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vect[], length = 0, n = 0, cont = 0, aux = 0, contTerms = 0;
		
		do{
		
			System.out.print(" Enter the numbers of Fibonacci terms you want:  ");
			length = sc.nextInt();
		
		} while (length <= 0 || length > 20);
		
		vect = new int[length];
		
		while ( contTerms < vect.length){
		
			cont = 0;
			aux = n;
			while(aux > 0){
				if (n % aux == 0){
					cont++;
				}
				aux--;
			}
			
			if (cont == 2){
				vect[contTerms] = n;
				contTerms++;
			}
			n++;
		
		}
		
		System.out.print("\n The Fibonacci terms are:");
		for(int element : vect){
			System.out.print(" " + element);
		}
		
		sc.close();
	}
}


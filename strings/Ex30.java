//Alex Borges da SIlva Junior

import java.util.Scanner;

public class Ex30 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		Scanner scStr = new Scanner (System.in);
		
		String alphabet = "", rot13 = "", sentence = "", criptoSentence = ""; 
		int index = 0, choice = 0;
		boolean isUpperCase  = true;
		
		for (char i = 'a'; i <= 'z'; i++){
		
			alphabet += i;
		
		}
		
		//tabela do rot13===========================
		int halfLength =  alphabet.length() / 2;
		String firstHalf = "", secondHalf = "";
		firstHalf = alphabet.substring(0, halfLength);
		secondHalf = alphabet.substring(halfLength);
		rot13 = secondHalf + firstHalf; 
		//==========================================
		
		
		do {
		
			sentence = "";
			criptoSentence = "";
			index = -1;
			isUpperCase = false;
		
			System.out.println("\n 1 - Criptografar");
			System.out.println(" 2 - Descriptografar");
			System.out.println(" 3 - Sair\n");
			
			System.out.print(" Escolha uma  das opcoes: ");
			choice = scNum.nextInt();
			
			if (choice == 1 ){
			
				System.out.print("Entre com a frase a ser criptografada: ");
				sentence = scStr.nextLine();
				sentence = sentence.trim();
				
				for (int i = 0; i < sentence.length(); i++){
				
					isUpperCase = Character.isUpperCase(sentence.charAt(i));
					
					if ( alphabet.contains( String.valueOf( sentence.toLowerCase().charAt( i ) ) ) ){
					
						index  = alphabet.indexOf( sentence.toLowerCase().charAt(i) );
						
						if (isUpperCase){
						
							criptoSentence += Character.toUpperCase(rot13.charAt(index));
							
						} else {
							
							criptoSentence += rot13.charAt(index);
							
							}
					
					} else {
						
						criptoSentence += sentence.charAt(i);
						
						}
				
				}
				
				System.out.println("\n\tFrase criptografada: " + criptoSentence); 
				
			} else if (choice ==  2){
			
				System.out.print("Entre com a frase a ser descriptografada: ");
				sentence = scStr.nextLine();
				sentence = sentence.trim();
				
				for (int i = 0; i < sentence.length(); i++){
				
					isUpperCase = Character.isUpperCase(sentence.charAt(i));
					
					if ( alphabet.contains( String.valueOf( sentence.toLowerCase().charAt( i ) ) ) ){
					
						index  = alphabet.indexOf( sentence.toLowerCase().charAt(i) );
						
						if (isUpperCase){
						
							criptoSentence += Character.toUpperCase(rot13.charAt(index));
							
						} else {
							
							criptoSentence += rot13.charAt(index);
							
							}
					
					} else {
						
						criptoSentence += sentence.charAt(i);
						
						}
				
				}
				
				System.out.println("\n\tFrase descriptografada: " + criptoSentence); 
			
			} else if (choice ==  3){
			
				System.out.println("\n\tOk! Ate mais");
			
			} else {
				
				System.out.println("\n\tERRO! Opcao invalida, tente novamente.");
				
				}
		
		} while (choice != 3);
		
		scNum.close(); scStr.close();
	}
}


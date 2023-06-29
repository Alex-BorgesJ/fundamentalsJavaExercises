//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Ex29 {
	
	public static void main (String[] args) {
		Scanner scStr = new Scanner (System.in);
		Scanner scNum = new Scanner (System.in);
		
		String zenit = "ZENIT", polar = "POLAR", sentence = "", criptosentence = ""; 
		int choice = 0;
		
		do {
			
			sentence = "";
			criptosentence = "";
			
			System.out.println("\n 1 - Criptografar");
			System.out.println(" 2 - Descriptografar");
			System.out.println(" 3 - Sair\n");
			
			System.out.print(" Escolha uma das opcoes: ");
			choice = scNum.nextInt();
			
			if (choice == 1){
				
				System.out.print(" Informe a frase a ser criptografada: ");
				sentence = scStr.nextLine();
				sentence = sentence.trim();
				
				int index = -1;
				boolean isUpperCase = false;
				
				for (int i = 0; i < sentence.length(); i++){
					
					isUpperCase = Character.isUpperCase(sentence.charAt(i));
					
					if (zenit.contains(String.valueOf(sentence.toUpperCase().charAt(i)))){
					
						index = zenit.indexOf(sentence.toUpperCase().charAt(i));
						if (isUpperCase) {
							criptosentence += polar.charAt(index);
						} else {
							 criptosentence += Character.toLowerCase(polar.charAt(index));
						}
					
					} else if (polar.contains(String.valueOf(sentence.toUpperCase().charAt(i)))) {
						
						index = polar.indexOf(sentence.toUpperCase().charAt(i));
						if (isUpperCase) {
							criptosentence += zenit.charAt(index);
						} else {
							 criptosentence += Character.toLowerCase(zenit.charAt(index));
						}
						
					} else {
					
						criptosentence += sentence.charAt(i);
					
					}
				
				}
				
				System.out.println();
				System.out.println("Frase criptografada: " + criptosentence); 
				
				} else if (choice == 2){
					
					System.out.print(" Informe a frase a serdescriptografada: ");
					sentence = scStr.nextLine();
					sentence = sentence.trim();
				
					int index = -1;
					boolean isUpperCase = false;
				
					for (int i = 0; i < sentence.length(); i++){
						
						isUpperCase = Character.isUpperCase(sentence.charAt(i));
						
						if (zenit.contains(String.valueOf(sentence.toUpperCase().charAt(i)))){
						
							index = zenit.indexOf(sentence.toUpperCase().charAt(i));
							if (isUpperCase) {
								criptosentence += polar.charAt(index);
							} else {
								 criptosentence += Character.toLowerCase(polar.charAt(index));
							}
						
						} else if (polar.contains(String.valueOf(sentence.toUpperCase().charAt(i)))) {
							
							index = polar.indexOf(sentence.toUpperCase().charAt(i));
							if (isUpperCase) {
								criptosentence += zenit.charAt(index);
							} else {
								 criptosentence += Character.toLowerCase(zenit.charAt(index));
							}
							
						} else {
						
							criptosentence += sentence.charAt(i);
						
						}
					
					}
				
					System.out.println();
					System.out.println("Frase criptografada: " + criptosentence); 
				
					
					} else if (choice == 3){
						
						System.out.println("\n\tOk! Ate mais ");
						
						} else {
							
							System.out.println("\n\tEscolha invalida! Tente novamente.");
							
							}

		} while (choice != 3); 
		
		scStr.close(); scNum.close();
	}
}


//Alex Borges da Silva Junior 

import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
	
					Scanner scNum = new Scanner (System.in);
					Scanner scStr = new Scanner (System.in);
					
					System.out.print("Deseja informar a hora (y/n)? "); 
					String escolha = scStr.next();
					
					switch (escolha){
						
						case "Y": 
						case "y": 
						case "yes":
						case "sim":
						case "Sim":
						
							System.out.print("Informe a hora do dia (0-23h): ");
							int hora = scNum.nextInt();
							
							if (hora >= 0 & hora <= 6){
								
								System.out.println("Zzzzzzzz");
								
								} else if (hora >= 7 & hora <= 11){
									
									System.out.println("Bom dia"); 
									
									} else if (hora >= 12 & hora <= 17){
									
									System.out.println("Boa Tarde"); 
									
									} else if (hora >= 18 & hora <= 23){
									
									System.out.println("Boa noite"); 
									
									} else {
										
										System.out.println("VALOR INVALIDO"); 
										
										}
										
										break; 
										
										case "N":
										case "n":
										case "no":
										case "nao":
										case "Nao": 
										
							hora = (int) (Math.random() * 23); 
							
							if (hora >= 0 & hora <= 6){
								
								System.out.println("Zzzzzzzz");
								
								} else if (hora >= 7 & hora <= 11){
									
									System.out.println("Bom dia"); 
									
									} else if (hora >= 12 & hora <= 17){
									
									System.out.println("Boa Tarde"); 
									
									} else if (hora >= 18 & hora <= 23){
									
									System.out.println("Boa noite"); 
									
									} else {
										
										System.out.println("VALOR INVALIDO"); 
										
										}
										
										break; 
										
										default: 
										
										System.out.println("Opcao nao valida");
										
										break;
						
						}
					
					scNum.close(); 	
					}
				}


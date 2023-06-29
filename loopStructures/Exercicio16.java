//Alex Borges da Silva Junior

public class Exercicio16 {
	
	public static void main (String[] args) {
	
	int num1 = 15;
	int soma = 0;
	int contador = 0;
	
	for (int i = 15; i <=100; i++){
		
		soma += i;
		
		contador++;
		
		}
	
	System.out.println();
	System.out.println("A media aritmetica dos dos numeros inteiros entre 15 e 100 (incluse) eh: " + (soma / contador));
	
	}
}


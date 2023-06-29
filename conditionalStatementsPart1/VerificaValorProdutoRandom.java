//Alex Borges da Silva Junior

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
			int precoProduto1 = ((int) (Math.random()*1000)) + 1; 
			int precoProduto2 = ((int) (Math.random()*1000)) + 1;
			
			if (precoProduto1 < precoProduto2){
				
				System.out.println("O produto 1 e mais barato"); 
				
				} else if (precoProduto2 < precoProduto1){
					
					System.out.println("O produto 2 e mais barato");
					
					} else {
						
						System.out.println("Os precos dos produtos sao iguais");
						
						}
	}
}


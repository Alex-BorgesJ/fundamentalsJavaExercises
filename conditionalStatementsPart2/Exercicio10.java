//Alex Borges da SIva Junior

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		
		Scanner scNum = new Scanner(System.in); 
		
		System.out.print("Informe o valor do salario fixo: ");
		double salarioFixo = scNum.nextDouble();
		System.out.print("Informe valor total das vendas: ");
		double valorVendas = scNum.nextDouble();
		
		Salario salario = new Salario(salarioFixo, valorVendas);
		salario.calcSalario();
		
		System.out.printf("O salario total deste colaborador e R$%.2f", salario.getSalarioTotal());
						
		scNum.close();
	}
}

class Salario{
	
	private double salarioFixo;
	private double valorVendas;
	private double comissao;
	private double salarioTotal;
	
	public Salario(){}
	
	public Salario(double salarioFixo, double valorVendas){
		
		this.salarioFixo = salarioFixo;
		this.valorVendas = valorVendas;
		
		}
		
		public double getSalarioFixo(){
			
			return salarioFixo;
			
			}
			
				public double getSalarioTotal(){
			
			return salarioTotal;
			
			}
			
			public void setSalarioFixo(double salarioFixo){
				
				this.salarioFixo = salarioFixo;
				
				}
				
				public double getValorVendas(){
			
			return valorVendas;
			
			}
			
			public void setValorVendas(double salarioFixo){
				
				this.valorVendas = valorVendas;
				
				}
				
				public double getComissao(){
					
					return comissao;
					
					}
				
				public void calcSalario(){
					
					if (valorVendas <= 1500.0){
						
						comissao = (valorVendas * 3.0 / 100.0);
						
						} else{
							
							comissao = (valorVendas * 5.0 / 100.0);
							
							}
					
					salarioTotal = salarioFixo + comissao;
					
					}
		
	}

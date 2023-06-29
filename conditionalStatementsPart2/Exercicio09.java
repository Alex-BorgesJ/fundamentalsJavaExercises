//Alex Borges da Silva Junior

		import java.util.Scanner;

		public class Exercicio09{
		public static void main (String [] args){

			Scanner scNum = new Scanner (System.in);
			Scanner scStr = new Scanner (System.in);
			
			System.out.print ("Informe  o nome do funcionario: ");
			String nome = scStr.nextLine();
			System.out.print ("Informe o valor do salario por hora: ");
			double salarioHora = scNum.nextDouble();
			System.out.print("Informe o numero de horas trabalhadas no mes: "); 
			int horas = scNum.nextInt();
			
			Empregados emp = new Empregados (nome, horas, salarioHora);
			emp.calcSalario();
			
			System.out.printf("O funcionanrio %s, cujo salario por hora e igual a R$%.2f, e trabalhou %d horas neste mes. Recebera um salario de R$%.2f", emp.getNome(), emp.getSalarioHora(), emp.getHoras(), emp.getSalario());

				scNum.close(); scStr.close();
				}
				}

		class Empregados{

				private String nome;
				private int horas;
				private double salarioHora;
				private double salario;


			public Empregados (String nome, int horas, double salarioHora){

				this.nome = nome;
				this.horas = horas;
				this.salarioHora  = salarioHora;

				}

				public String getNome () {

				return nome;

				}

				public void setNome (String nome){

				this.nome = nome;

				}

				public int getHoras (){

				return horas; 

				}

				public void setHoras(int horas){

				this.horas = horas;

				}

				public double getSalarioHora(){

				return salarioHora;

				}

				public void setSalarioHora(double salarioHora){

				this.salarioHora = salarioHora;

				}
				
				public double getSalario(){
					
					return salario;
					
					}

				public double  calcSalario() {
					
					if (horas > (4*40)){
						
						int horasAdicionais = horas - (4*40); 
						salario = (salarioHora *(4*40)) + ((1.5*salarioHora) * horasAdicionais);
						
						} else {
							
							salario = salarioHora * horas; 
							
							}
					
					return salario;
					
				}



				}


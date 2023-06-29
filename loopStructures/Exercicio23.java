//Alex Borges da Silva Junior

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		int quantHabitants;
		double salaryOfHabitants;
		int numberOfChildren;
		double avgNumberOfChildren = 0;
		double avgSalaryOfHabitants = 0;
		double maxSalaryOfHabitants = 0;
		double percentHabitantsOfSalaryInf = 0;
		
		System.out.print("Enter the number of habitants: ");
		quantHabitants = scNum.nextInt();
		System.out.println();
		
		for (int i = 1; i <= quantHabitants; i++){
			
			System.out.print("Enter the number of children of habitant #"+ i +": ");
			numberOfChildren = scNum.nextInt();
			System.out.print("Enter the resident #" + i +" salary value: R$ ");
			salaryOfHabitants = scNum.nextDouble();
			System.out.println();
			
			if (salaryOfHabitants > maxSalaryOfHabitants){
				
				maxSalaryOfHabitants = salaryOfHabitants;
				
				}
				
				if (salaryOfHabitants < 150.0){
					
					percentHabitantsOfSalaryInf += 1;
					
					}
				
				avgSalaryOfHabitants += salaryOfHabitants;
				avgNumberOfChildren += numberOfChildren;
			
			}
			
			avgSalaryOfHabitants = avgSalaryOfHabitants / quantHabitants;
			avgNumberOfChildren = avgNumberOfChildren / quantHabitants;
			percentHabitantsOfSalaryInf = (percentHabitantsOfSalaryInf / quantHabitants) * 100.0;
			
			System.out.println("Avarage salary of resident's: " + avgSalaryOfHabitants);
			System.out.println("Avarage number of childrens: " + avgNumberOfChildren);
			System.out.println("Highest salary among the habitants: " + maxSalaryOfHabitants);
			System.out.println("Percentage of people with salary/wage less than R$ 150.00: " + percentHabitantsOfSalaryInf);
		
		scNum.close();
	}
}


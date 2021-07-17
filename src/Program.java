import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Employee salario = new Employee();
		
		salario.name = sc.nextLine();
		salario.GrossSalary = sc.nextDouble();
		salario.Tax = sc.nextDouble();
		
		
		System.out.printf("Name: %s", salario.name);
		System.out.println();
		System.out.printf("Gross Salary: %.2f", salario.GrossSalary);
		System.out.println();
		System.out.printf("Tax: %.2f%n", salario.Tax);
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f ",salario.name ,salario.NetSalary()); 
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		System.out.println();
		salario.IncreaseSalary(sc.nextDouble());
		System.out.println(salario);
		
		
		

	}

}

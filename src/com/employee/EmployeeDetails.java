/* 2. Take employee details like name, ID, and basic salary.
   Calculate HRA, DA, and net salary. Print a formatted salary slip using methods */

package com.employee;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();

		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();

		System.out.println("Enter Employee Salary:");
		Double salary = sc.nextDouble();

		Employee e = new Employee(name, id, salary);
		e.displaySlip();
		sc.close();
	}
}

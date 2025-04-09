package com.employee;

public class Employee {
	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void displaySlip() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Salary: " + salary);
		System.out.println("==========================");
		System.out.println("       Salary Slip       ");
		System.out.println("==========================");
		System.out.println(calculate());
	}

	public double calculate() {
		double HRA = 0.20 * salary;
		double DA = 0.10 * salary;
		double netSalary = salary + HRA + DA;

		System.out.println("Basic Salary:" + salary);
		System.out.println("HRA (20%)   :" + HRA);
		System.out.println("DA (10%)    :" + DA);
		System.out.println("Net Salary  :" + netSalary);
		return netSalary;
	}
}

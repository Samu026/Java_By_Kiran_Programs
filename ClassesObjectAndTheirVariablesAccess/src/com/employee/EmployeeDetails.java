/* Create a Employee Class with instance variables empid, name, 
 * age, address, email, and mob_no, gender, department and salary.
 * Create at least two objects, assign values, and display their details */

package com.employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empid = 1001;
		e.name = "Samruddhi";
		e.age = 20;
		e.address = "Pune";
		e.email = "sam@gmail.com";
		e.mob_no = 7030806080L;
		e.gender = "Female";
		e.department = "AIML";
		e.salary = 3000000;
		System.out.println("Employee Id: " + e.empid);
		System.out.println("Employee Name: " + e.name);
		System.out.println("Employee Age: " + e.age);
		System.out.println("Employee Address: " + e.address);
		System.out.println("Employee Email: " + e.email);
		System.out.println("Employee Mobno.: " + e.mob_no);
		System.out.println("Employee Gender: " + e.gender);
		System.out.println("Employee Department: " + e.department);
		System.out.println("Employee Salary: " + e.salary);

		System.out.println("-------------------------------");

		Employee e1 = new Employee();
		e1.empid = 2002;
		e1.name = "Nikita";
		e1.age = 20;
		e1.address = "Nagar";
		e1.email = "nik@gmail.com";
		e1.mob_no = 8976546754L;
		e1.gender = "Female";
		e1.department = "CS";
		e1.salary = 7650000;
		System.out.println("Employee Id: " + e1.empid);
		System.out.println("Employee Name: " + e1.name);
		System.out.println("Employee Age: " + e1.age);
		System.out.println("Employee Address: " + e1.address);
		System.out.println("Employee Email: " + e1.email);
		System.out.println("Employee Mobno.: " + e1.mob_no);
		System.out.println("Employee Gender: " + e1.gender);
		System.out.println("Employee Department: " + e1.department);
		System.out.println("Employee Salary: " + e1.salary);

	}
}

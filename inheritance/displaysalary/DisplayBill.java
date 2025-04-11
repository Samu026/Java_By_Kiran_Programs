/* Employee and Salary. Create a class Employee with empId, empName. 
 * Inherit a class Salary that includes basicPay, hra, and da. 
 * Calculate and print total salary.
 */

package inheritance.displaysalary;

import java.util.Scanner;

public class DisplayBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Salary s = new Salary();

		System.out.println("Enter Employee Id  : ");
		s.empId = sc.nextInt();

		System.out.println("Enter Employee Name: ");
		s.empName = sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Basic Salary : ");
		s.basicPay = sc.nextDouble();

		System.out.println("Enter HRA : ");
		s.HRA = sc.nextDouble();

		System.out.println("Enter DA  : ");
		s.DA = sc.nextDouble();

		System.out.println("------Employee Details------");
		s.displayEmployee();
		System.out.println();
		System.out.println("------Bill of Employee------");
		
		s.calculateBill();
		sc.close();
	}
}

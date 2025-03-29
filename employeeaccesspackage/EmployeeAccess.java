/*Create Employee Class with some methods in it. 
 * Create its 10 object in main class */

package employeeaccesspackage;

import employeepackage.Employee;

public class EmployeeAccess {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.employeeName();

		Employee e2 = new Employee();
		e2.employeeId();

		Employee e3 = new Employee();
		e3.employeeRole();

		Employee e4 = new Employee();
		e4.employeeSalary();

		Employee e5 = new Employee();
		e5.employeeContactNo();

		Employee e6 = new Employee();
		e6.employeeMail();

		Employee e7 = new Employee();
		e7.employeeAddress();

		Employee e8 = new Employee();
		e8.employeeJoiningDate();

		Employee e9 = new Employee();
		e9.employeeWorkExperience();

		Employee e10 = new Employee();
		e10.employeeRating();
	}
}

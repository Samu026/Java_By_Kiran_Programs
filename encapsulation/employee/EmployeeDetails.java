/* Create a class Employee with fields: empId, empName, salary.
Use getter and setter methods.
If salary is set below 10,000, it should display a warning message.*/

package encapsulation.employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e = new Employee();

		e.setEmpId(1);
		System.out.println("Employee Id :" + e.getEmpId());

		e.setEmpName("Samruddhi");
		System.out.println("Employee Name :" + e.getEmpName());

		e.setSalary(88);
		System.out.println("Employee Salary :" + e.getSalary());

		if (e.getSalary() < 10000) {
			System.out.println("Warning your salary is minimum !!! ");
		}

	}
}

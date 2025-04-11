package inheritance.displaysalary;

public class Salary extends Employee {
	double basicPay;
	double HRA;
	double DA;
	double totalSalary;

	public void calculateBill() {

		double totalSalary = basicPay + HRA + DA;
		System.out.println("Basic Salary : "+basicPay);
		System.out.println("HRA          : "+HRA);
		System.out.println("DA           : "+DA);
		System.out.println("____________________________");
		System.out.println("Total Salary : "+totalSalary);
	}
}

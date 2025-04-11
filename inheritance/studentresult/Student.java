package inheritance.studentresult;

public class Student {
	String name;
	int rollNo;

	public void studentBasicData(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("Name of Student : " + name);
		System.out.println("Roll Number     : " + rollNo);
	}
}

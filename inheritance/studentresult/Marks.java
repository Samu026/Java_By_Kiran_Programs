package inheritance.studentresult;

public class Marks extends Student {
	int subject1;
	int subject2;
	int total;

	public void calculateMarks(int subject1, int subject2) {
		this.subject1 = subject1;
		this.subject2 = subject2;

		System.out.println("Subject 1 Marks : " + subject1);
		System.out.println("Subject 2 Marks : " + subject2);
		total = subject1 + subject2;
		System.out.println("Total Marks     : " + total);
	}

	public void calculateAverage() {
		int average = total / 2;
		System.out.println("Average Marks   : " + average);
	}
}

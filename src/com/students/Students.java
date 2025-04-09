package com.students;

public class Students {
	int rollno;
	String name;
	int mathsMarks;
	int scienceMarks;
	int englishMarks;

	public Students(int rollno, String name, int mathsMarks, int scienceMarks, int englishMarks) {
		this.rollno = rollno;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.englishMarks = englishMarks;
	}

	public void display() {
		System.out.println("Student Rollno.      : " + rollno);
		System.out.println("Student Name         : " + name);
		System.out.println("Student mathsMarks   : " + mathsMarks);
		System.out.println("Student scienceMarks : " + scienceMarks);
		System.out.println("Student englishMarks : " + englishMarks);
	}

	public void result() {
		int total = mathsMarks + scienceMarks + englishMarks;
		int average = total / 3;
		double percentage = (total / 300.0) * 100;
		System.out.println("Total Marks: " + total);
		System.out.println("Average    : " + average);
		System.out.println("Percentages: " + percentage);

		if (percentage >= 80 && percentage <= 100) {
			System.out.println("A Grade");
		} else if (percentage >= 60 && percentage <= 79) {
			System.out.println("B Grade");
		} else if (percentage >= 35 && percentage <= 59) {
			System.out.println("C Grade");
		} else {
			System.out.println("Fail....");
		}

	}
}

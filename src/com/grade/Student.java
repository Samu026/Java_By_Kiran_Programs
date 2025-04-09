package com.grade;

public class Student {
	int Id;
	String Name;
	String Course;
	double Percentage;

	public Student(int Id, String Name, String Course, double Percentage) {
		this.Id = Id;
		this.Name = Name;
		this.Course = Course;
		this.Percentage = Percentage;
	}

	public void studentDetails() {
		System.out.println("Student Id: " + Id);
		System.out.println("Student Name: " + Name);
		System.out.println("Student Course: " + Course);
		System.out.println("Student Percentage: " + Percentage);
		System.out.println("Student Grade: " + calculateGrade());
	}

	public String calculateGrade() {
		if (Percentage >= 90 && Percentage <= 100) {
			return "A";
		} else if (Percentage >= 80 && Percentage <= 89) {
			return "B";
		} else if (Percentage >= 70 && Percentage <= 79) {
			return "C";
		} else if (Percentage >= 60 && Percentage <= 69) {
			return "D";
		} else if (Percentage >= 50 && Percentage <= 59) {
			return "E";
		} else {
			return "F";
		}
	}
}

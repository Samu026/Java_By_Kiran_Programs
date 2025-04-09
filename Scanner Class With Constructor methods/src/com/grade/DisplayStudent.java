package com.grade;

import java.util.Scanner;

public class DisplayStudent {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Id: ");
		int Id = sc.nextInt();

		System.out.println("Enter Name: ");
		String Name = sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Course: ");
		String Course = sc.nextLine();

		System.out.println("Enter Percentage: ");
		double Percentage = sc.nextDouble();

		Student s = new Student(Id, Name, Course, Percentage);
		s.studentDetails();
		sc.close();
	}
}

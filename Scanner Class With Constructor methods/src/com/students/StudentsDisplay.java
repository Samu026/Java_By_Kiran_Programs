/*5. Take student name, roll number, and marks for 3 subjects.
   Calculate total and average. Display grade (A/B/C/Fail) using if-else logic.*/

package com.students;

import java.util.Scanner;

public class StudentsDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Roll no.: ");
		int rollno = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Maths Marks (Out of 100) : ");
		int mathsMarks = sc.nextInt();
		while (mathsMarks < 0 || mathsMarks > 100) {
			System.out.println("Enter between 0 - 100 Marks");
			mathsMarks = sc.nextInt();
		}

		System.out.println("Enter Science Marks (Out of 100) : ");
		int scienceMarks = sc.nextInt();
		while (scienceMarks < 0 || scienceMarks > 100) {
			System.out.println("Enter between 0 - 100 Marks");
			scienceMarks = sc.nextInt();
		}

		System.out.println("Enter English Marks (Out of 100) : ");
		int englishMarks = sc.nextInt();
		while (englishMarks < 0 || englishMarks > 100) {
			System.out.println("Enter between 0 - 100 Marks");
			englishMarks = sc.nextInt();
		}

		Students s = new Students(rollno, name, mathsMarks, scienceMarks, englishMarks);
		s.display();
		s.result();
		sc.close();

	}
}

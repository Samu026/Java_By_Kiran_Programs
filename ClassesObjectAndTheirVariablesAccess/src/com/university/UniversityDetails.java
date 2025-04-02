/* Create a University class with instance variables universityName, location, 
 * numStudents, numProfessors, Ranking, foundingYear, department and graduationLevel
 * create at least two objects, assign values, and display their details. */

package com.university;

public class UniversityDetails {
	public static void main(String[] args) {
		University s=new University();
		s.universityName="SPPU";
		s.location="Pune";
		s.numStudents=9000;
		s.numProfessors=90;
		s.ranking=1;
		s.foundingYear=1900;
		s.department="Engineering";
		s.graduationLevel="PHD";
		System.out.println("University Name: "+s.universityName);
		System.out.println("Location: "+s.location);
		System.out.println("Number of students: "+s.numStudents);
		System.out.println("Number of professors: "+s.numProfessors);
		System.out.println("Ranking: "+s.ranking);
		System.out.println("Founding Year: "+s.foundingYear);
		System.out.println("Department: "+s.department);
		System.out.println("Graduation Level: "+s.graduationLevel);
		
		System.out.println("--------------------------");
		
		University s1=new University();
		s1.universityName="DBATU";
		s1.location="Nashik";
		s1.numStudents=4000;
		s1.numProfessors=40;
		s1.ranking=2;
		s1.foundingYear=2000;
		s1.department="Medical";
		s1.graduationLevel="PHD";
		System.out.println("University Name: "+s1.universityName);
		System.out.println("Location: "+s1.location);
		System.out.println("Number of students: "+s1.numStudents);
		System.out.println("Number of professors: "+s1.numProfessors);
		System.out.println("Ranking: "+s1.ranking);
		System.out.println("Founding Year: "+s1.foundingYear);
		System.out.println("Department: "+s1.department);
		System.out.println("Graduation Level: "+s1.graduationLevel);
		
	}
}

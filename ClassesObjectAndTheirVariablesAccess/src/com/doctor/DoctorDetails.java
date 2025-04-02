/* Create a Doctor class with instance variables doctorName, 
 * specialization, hospitalName, experienceYears, consultationFee, 
 * contactNumber and hospitalLocation. Create at least two objects, 
 * assign values, and print their details. */

package com.doctor;

public class DoctorDetails {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		Doctor d1 = new Doctor();

		System.out.println("------Doctor Details------");
		d.doctorName = "Dr. Shyam";
		d.specialization = "Skin Specialist";
		d.hospitalName = "abc";
		d.experienceYears = 2;
		d.consultationFee = 200;
		d.contactNumber = 9876567432L;
		d.hospitalLocation = "Pune";
		System.out.println("Doctor Name: " + d.doctorName);
		System.out.println("Doctor Specialization: " + d.specialization);
		System.out.println("Hospital Name: " + d.hospitalName);
		System.out.println("Experience Years: " + d.experienceYears);
		System.out.println("Consultation Fee: " + d.consultationFee);
		System.out.println("Contact Number: " + d.contactNumber);
		System.out.println("Hospital Location: " + d.hospitalLocation);
		System.out.println();

		d1.doctorName = "Dr. Ram";
		d1.specialization = "Dentist Specialist";
		d1.hospitalName = "xyz";
		d1.experienceYears = 3;
		d1.consultationFee = 300;
		d1.contactNumber = 8765456789L;
		d1.hospitalLocation = "Mumbai";
		System.out.println("------Doctor Details------");
		System.out.println("Doctor Name: " + d1.doctorName);
		System.out.println("Doctor Specialization: " + d1.specialization);
		System.out.println("Hospital Name: " + d1.hospitalName);
		System.out.println("Experience Years: " + d1.experienceYears);
		System.out.println("Consultation Fee: " + d1.consultationFee);
		System.out.println("Contact Number: " + d1.contactNumber);
		System.out.println("Hospital Location: " + d1.hospitalLocation);
	}
}

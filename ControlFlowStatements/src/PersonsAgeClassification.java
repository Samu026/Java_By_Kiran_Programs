/* 8.Write a program to classify a person's age group:

8-12: Child
13-18: Teenager
20-30: Adult
60 and Above : Senior Citizen */

public class PersonsAgeClassification {
	public static void main(String args[]) 
	{
		int age = 21;
		
		if(age>=0 && age<=12) {
			System.out.println("You is Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("You is Teenager");
		}else if(age>=20 && age<=59){
			System.out.println("You is Adult");
		}
		else if(age>=60) {
			System.out.println("You is Senior Citizen");
		}else {
			System.out.println("Invalid age");
		}
	}
}

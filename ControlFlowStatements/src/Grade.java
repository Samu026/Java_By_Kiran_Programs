/*6.write a program to assign grades to students based on their marks:

90-100: A
78-791: C
60-69: D
Below 68: Fail */

public class Grade {
	public static void main(String args[])
	{
		int marks= 90;
		
		if( marks<=100 &&  marks>=90) {
			System.out.println("Cogradulations your grade is A !!!");
		}else if(marks<=89 && marks >=80) {
			System.out.println("Cogradulations your grade is B !!!");
		}else if(marks<=79 && marks >=70) {
			System.out.println("Cogradulations your grade is C !!!");
		}else if(marks<=69 && marks>=60) {
			System.out.println("Cogradulations your grade is D !!!");
		}else if(marks<=59) {
			System.out.println("Fail !!!");
		}else {
			System.out.println("Invalid marks !!!");
		}
	}
}

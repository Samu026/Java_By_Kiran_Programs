/* 14.Write a program to categorize a person based on gender and age:

Male, age 21 Eligible for marriage

Famale, age 18 Eligible for marriage

Otherwise, not eligible */

public class MarriageCriteria {
	public static void main(String args[])
	{
		int age=21;
		String gender="Female";
		
		if(age>21 && gender=="Male" || age>18 && gender=="Female") {
			System.out.println("Eligible for Marriage");
		}else {
			System.out.println("Not Eligible for Marriage");
		}
	}	
	
}

/* 10.Write a program to check the eligibility of a student for 
a scholarship based on marks and income criteria. */

public class ScholorshipEligibility {
	public static void main(String args[])
	{
		int marks=90;
		double income=9000;
		
		if(marks>=60 && marks <=100 && income <=100000)
		{
			System.out.println("You are Eligible");
		}else{
			System.out.println("You are not Eligible");
		}
	}
}

/* 7.Write a program to check whether a given year is a leap year or not.*/

public class LeapYearCheck {
	public static void main(String args[]) {
		int year = 3000;
		
		if ((year%400==0) || (year%4==0 && year%100 !=0)) {
			System.out.println(year+" is Leap Year!!");
		}else {
			System.out.println(year+" is not Leap Year!!");
		}
	}
}

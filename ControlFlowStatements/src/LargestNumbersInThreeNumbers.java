/* 11.Write a program to find the largest of three numbers. */

public class LargestNumbersInThreeNumbers {
	public static void main(String args[])
	{
		int a=9,b=900,c=900;
		
		if(a>b && a>c) {
			System.out.println(a+ " is Large Number");
		}else if(b>a && b>c) {
			System.out.println(b+ " is Large Number");
		}else if(c>a && c>b) {
			System.out.println(c+ " is Large Number");
		}else if(a==b && a==c && b==c) {
			System.out.println("a,b,c are same Number is "+a);
		}else if(a==b) {
			System.out.println("a and b have same Number is "+a);
		}else if(a==c) {
			System.out.println("a and c have same Number is "+a);
		}else if(b==c) {
			System.out.println("b and c have same Number is "+b);
		}
	}
}

/* 3.Write a program to find the largest of two numbers.*/

public class LargestNumber {
	public static void main(String args[]) {
		int num1=20, num2=21;
		if (num1>num2) {
			System.out.println("Largest number is: "+num1);
		}else if(num2>num1){
			System.out.println("Largest number is: "+num2);
		}else {
			System.out.println("Number is same");
		}
	}

}

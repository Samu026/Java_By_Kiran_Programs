/* 13.Write e program to check if a given number is divisible by both 5 and 11.*/

public class DivisibleBy5and11 {
	
	public static void main(String args[])
	{
		int num =50;
		if(num%5==0 && num%11==0) {
			System.out.println(num+" is divisible by 5 and 11");
		}else {
			System.out.println(num+" is not divisible by 5 and 11");
		}
	
	}

}

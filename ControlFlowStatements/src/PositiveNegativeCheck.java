/* 5.write a program to check whether a number is positive, negative, or zero.*/

public class PositiveNegativeCheck {
	public static void main(String args[])
	{
		int num=-99;
		
		if (num>0) {
			System.out.println("Positive Number is:"+num);
		}else if(num<0) {
			System.out.println("Negative Number is:"+num);
		}else {
			System.out.println("Number is Zero");
		}
	}

}

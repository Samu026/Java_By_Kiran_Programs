/* Write a java program to add, subtract,multiply and divide 
   two numbers entered by the user  */

import java.util.Scanner;
public class ArithmeticOperators 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        int addition = num1 + num2;
        int subtract = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;
        
        System.out.println("Addition      : " + addition);
        System.out.println("Subtraction   : " + subtract);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division      : " + division);
        System.out.println("Remainder     : " + remainder );
        
        sc.close();
        
	}
}

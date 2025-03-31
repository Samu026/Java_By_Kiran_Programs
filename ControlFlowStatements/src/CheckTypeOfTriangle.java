/* 9.Write a program to determine the type of triangle 
 (equilateral, isosceles, or scalene) based on user input sides. */


public class CheckTypeOfTriangle {
	public static void main(String args[])
	{
		int a=20,b=20,c=20;
		
		if(a==b && a==c && b==c)
		{
			System.out.println("Equilateral Triangle");
		}else if(a==b || a==c || b==c)
		{
			System.out.println("Isosceles Triangle");
		}else if(a!=b && a!=c && b!=c)
		{
			System.out.println("Scalene Triangle");
		}
	}
}

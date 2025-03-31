/* Write a Java Program to find the area and perimeter 
	   of a rectangle using arithmetic operators*/

public class RectangleAreaPerimeter 
{
	public static void main (String args)
	{ 
		int length =15, width= 7;
			
		int area= length*width;
		int perimeter = 2*(length+width);
			
		System.out.println("Area of Rectangle      :"+area);
		System.out.println("Perimeter of Rectangle :"+perimeter);
					
	}
}

/*Find area rectangle, square, triangle (Constructor with no Argument /Parameter)*/

package com.program;

public class AreaRectangleSquare {
	public static void main(String[] args) {
		AreaRectangleSquare rs = new AreaRectangleSquare();
	}

	private AreaRectangleSquare() {
		int l = 20;
		int w = 10;
		int s = 20;
		int b = 5;
		int h = 8;

		int rectarea = l * w;
		System.out.println("Area of Rectangle: " + rectarea);

		int squarearea = s * s;
		System.out.println("Area of Square: " + squarearea);

		double trianglearea = 0.5 * b * h;
		System.out.println("Area of Triangle: " + trianglearea);
	}
}

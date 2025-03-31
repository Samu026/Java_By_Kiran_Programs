public class AreaShapes 
{
	public static void main(String args[])
	{
		int side=10,length=5,breadth=7,radius=8,height=9,base=6;
		final double pi=3.14;
		
		System.out.println("Area of Rectangle : "+(length*breadth));
		System.out.println("Area of Square : "+(side*side));
		System.out.println("Area of Cylinder : "+(2*pi*radius*(height+radius)));
		System.out.println("Area of Triangle : "+(0.5*base*height));
		System.out.println("Area of Circle : "+(pi*radius*radius));
		System.out.println("Area of Cube : "+(6*side*side));
		System.out.println("Area of Sphere : "+(4*pi*radius*radius));
		System.out.println("Area of Cone : "+(pi*radius*(radius+height)));
	}
}

public class LogicalOperator 
{
	public static void main(String args[])
	{
		// Logical Operator (&&, ||, !, ^)
		
		int a=3,b=2;
		
		// Logical AND (&&)
		System.out.println("Logical AND");
		System.out.println(a>b && b<a); //true  (true && true)
		System.out.println(a<b && b<a); //false (false && true)
		System.out.println(a>b && b>a); //false (true && false)
		System.out.println(a<b && b>a); //false (false && false)
		
		//Logical OR (||)
		System.out.println("Logical OR");
		System.out.println(a>b || b<a); //true  (true || true)
		System.out.println(a<b || b<a); //true  (false || true)
		System.out.println(a>b || b>a); //true  (true || false)
		System.out.println(a<b || b>a); //false (false || false)
		
		//Logical NOT (!)
		System.out.println("Logical NOT");
		System.out.println(!(b<a)); //false (!true)
		System.out.println(!(b>a)); //true  (!false)
		System.out.println(!(a<b)); //true  (!false)
		System.out.println(!(a>b)); //false (!true)
		
		//Logical XOR (^)
		System.out.println("Logical XOR");
		System.out.println(a>b ^ b<a); //false  (true ^ true))
		System.out.println(a<b ^ b<a); //true   (false ^ true)
		System.out.println(a>b ^ b>a); //true   (true ^ false))
		System.out.println(a<b ^ b>a); //false	(false ^ false)						
		
	}
}

/* Program of switch case of calculator */

public class SwitchCaseCalculator {
	public static void main(String args[]) {
		
		int a=6,b=3;
		
		char operator='-';
		
		switch(operator) {
		
		case '+':
			System.out.println("Addition is: "+ (a+b));
			break;
		case '-':
			System.out.println("Substraction is: "+ (a-b));
			break;
		case '*':
			System.out.println("Multiplication is: "+ (a*b));
			break;
		case '/':
			System.out.println("Division is: "+ (a/b));
			break;
		case '%':
			System.out.println("Remainder is: "+ (a%b));
			break;
		default:
			System.out.println("Invalid Input !!!");
		}
	}
}

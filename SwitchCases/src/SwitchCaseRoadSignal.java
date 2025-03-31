/* Write a program that takes a color (Red, Yellow, Green) as input and prints
   the corresponding action (Stop, Slow Down, Go)
 */

public class SwitchCaseRoadSignal {
	public static void main(String args[]) {
		
		String signal ="Red";
		
		switch(signal) {
		case "Red": 
			System.out.println("Stop !!!");
			break;
		case "Yellow":
			System.out.println("Slow Down !!!");
		    break;
		case "Green":
			System.out.println("Go !!!");
			break;
		default:
			System.out.println("Not Exists in Signal Color !!!");
		}
	}
}

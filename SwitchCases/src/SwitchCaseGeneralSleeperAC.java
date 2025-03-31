/* Take the class type 1:General, 2:Sleeper, 3:AC as input and print the 
   fare details for each class
 */

public class SwitchCaseGeneralSleeperAC {
	public static void main(String args[])
	{
		int condition =2;
		
		switch(condition) {
		case 1:
			System.out.println("General Condition");
			System.out.println("Fare: Rs. 50");
			System.out.println("Facilities: No reservation, basic seating");
			System.out.println("Availability: High");
			break;
		case 2:
			System.out.println("Sleeper Condition");
			System.out.println("Fare: Rs. 150");
            System.out.println("Facilities: Sleeping berths, fans, reserved seats");
            System.out.println("Availability: Moderate");
			break;
		case 3:
			System.out.println("AC Condition");
			System.out.println("Fare: Rs. 500");
            System.out.println("Facilities: Air-conditioned coach, bedding, comfortable seating");
            System.out.println("Availability: Limited");
			break;
		default:
			System.out.println("Invalid imput please enter 1-3");
		}	
	}
}

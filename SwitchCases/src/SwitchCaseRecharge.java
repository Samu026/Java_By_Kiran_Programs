/* Implement a menu driven program when the user selects a recharge plan
   (1: Data Plan, 2: TalkTime Plan, 3: SMS pack and displays the 
    price accordingly */

public class SwitchCaseRecharge {
	
	public static void main(String args[])
	{
		int Recharge= 2;
		
		switch(Recharge) {
		
		case 1: 
		System.out.println("Jio Data Plan !!!");
		System.out.println("1 GB/Day Data Plan Monthly = Rs. 299");
		System.out.println("2 GB/Day Data Plan Monthly = Rs. 409");
		System.out.println("3 GB/Day Data Plan Monthly = Rs. 449");
		System.out.println("4 GB/Day Data Plan Monthly = Rs. 599");
		
		break;
		
		case 2: 
		System.out.println("Jio TalkTime Plan !!!");
		System.out.println("1 GB/Day TalkTime Plan Monthly = Rs. 211");
		System.out.println("2 GB/Day TalkTime Plan Monthly = Rs. 299");
		System.out.println("3 GB/Day TalkTime Plan Monthly = Rs. 449");
		System.out.println("3 GB/Day TalkTime Plan Monthly = Rs. 449");
		break;
		
		case 3: 
		System.out.println("Jio SMS Plan !!!");
		System.out.println("1 GB/Day SMS Plan Monthly = Rs. 149");
		System.out.println("2 GB/Day SMS Plan Monthly = Rs. 299");
		System.out.println("3 GB/Day SMS Plan Monthly = Rs. 350");
		System.out.println("3 GB/Day SMS Plan Monthly = Rs. 449");
		break;
		
		default: 
		System.out.println("Not Plan Exist !!!");
		}
	}
	
}

/* Create a program where the user enters the number of wheels(2,3,4,6)
   and displays the type of vehicles (Bike, Auto-Rickshaw, Car, Truck) */

public class SwitchCaseVehiclesTypes {
	public static void main(String args[])
	{
		int wheels=2;
		
		switch(wheels) {
		
		case 2: 
			System.out.println("Two Wheeler : Bike");
			break;
		case 3:
			System.out.println("Three Wheeler : Auto Rickshaw");
			break;
		case 4:
			System.out.println("Four Wheeler : Car");
			break;
		case 6: 
			System.out.println("Six Wheeler : Truck");
			break;
		default:
			System.out.println("Not present in type of vehicles !!!");
		}
	}
}

/* Take a season 1:summer, 2:winter, 3: rainy as input and print
   the appropriate advisory message (stay Hydrated, wear warm clothes, 
   carry an umbrella) */

public class SwitchCaseSeason {
	public static void main(String args[])
	{
		String season = "Rainy";
		
		switch(season) {
		
		case "Summer":
			System.out.println("Stay Hydrated !!!");
			break;
		case "Winter":
			System.out.println("Wear Warm Clothes !!!");
			break;
		case "Rainy":
			System.out.println("Carry an Umbrella !!!");
			break;
		default:
			System.out.println("Invalid Seasons !!!");
		}
	}
}

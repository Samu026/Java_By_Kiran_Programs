/* Implement a game system Where a user selects a difficulty level 1: Easy,
   2:Medium, 3:Hard and prints a message */

public class SwitchCaseGameLevels {
	public static void main(String args[])
	{
		int level=1;
		
		switch(level) {
		
		case 1:
			System.out.println("Easy level of Game !!!");
			break;
		case 2:
			System.out.println("Medium Level of Game !!!");
			break;
		case 3:
			System.out.println("Hard Level of Game !!!");
			break;
		default:
			System.out.println("Level not exists !!!");
		}
	}
}

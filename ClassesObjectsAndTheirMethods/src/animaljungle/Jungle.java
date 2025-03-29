/* Create Animal Class with some methods in it. 
 * Create its 5 objects in Jungle Class */

package animaljungle;

public class Jungle {
	public static void main(String args[]) {
		Animals a1 = new Animals();
		Animals a2 = new Animals();
		Animals a3 = new Animals();
		Animals a4 = new Animals();
		Animals a5 = new Animals();
		a1.displayNames();
		a2.displayColors();
		a3.displayMovement();
		a4.displayFood();
		a5.displaylives();

	}
}

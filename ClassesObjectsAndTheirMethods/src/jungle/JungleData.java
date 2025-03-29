/* Create Animal Class with some methods in it. 
 * Create its 5 objects in Jungle Class */

package jungle;

import animals.AnimalsData;

public class JungleData {
	public static void main(String args[]) {
		AnimalsData a1 = new AnimalsData();
		AnimalsData a2 = new AnimalsData();
		AnimalsData a3 = new AnimalsData();
		AnimalsData a4 = new AnimalsData();
		AnimalsData a5 = new AnimalsData();
		a1.displayNames();
		a2.displayColors();
		a3.displayMovement();
		a4.displayFood();
		a5.displaylives();

	}
}

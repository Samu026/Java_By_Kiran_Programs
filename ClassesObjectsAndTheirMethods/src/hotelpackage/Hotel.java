/* Create Food class with some methods in it.
 * create its 5 objects in Hotel Class */

package hotelpackage;

import foodpackage.Food;

public class Hotel {
	public static void main(String[] args) {
		Food f1 = new Food();
		f1.displayFoodNames();

		Food f2 = new Food();
		f2.displayFoodPrices();

		Food f3 = new Food();
		f3.displayFoodQuantity();

		Food f4 = new Food();
		f4.displayVegNonveg();

		Food f5 = new Food();
		f5.displayFoodTaste();
	}

}

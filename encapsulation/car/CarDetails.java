/* Create a class Car with fields: model, year, and price.
Ensure price cannot be set below zero. Create a method to display car details.*/

package encapsulation.car;

public class CarDetails {
	public static void main(String[] args) {
		Car c = new Car();

		c.setModel("BMW");
		System.out.println("Model Name is: " + c.getModel());

		c.setYear(2020);
		System.out.println("Model Year is: " + c.getYear());

		double carPrice = c.setPrice(-98);
		if (carPrice > 0) {
			System.out.println("Model Price is: " + c.getPrice());
		}
	}
}

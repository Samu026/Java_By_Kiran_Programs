/* Vehicle Example: Create a class Vehicle with a method start(). 
 * Inherit Car class with method drive(). Call both methods using a Car object.
 */

package inheritance.vehicles;

public class VehicleDetails {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive("60 KM/Hrs");

	}
}

package inheritance.vehicles;

public class Car extends Vehicles {
	String speed;

	public String drive(String speed) {
		this.speed = speed;
		System.out.println("Driving speed is " + speed + " of your Car....");
		return speed;
	}
}

package encapsulation.car;

public class Car {
	private String model;
	private int year;
	private double price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public double setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price canot be below zero");
		}
		return price;
	}
}

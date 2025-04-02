/* Create a Gadget class with instance variables deviceName, brand, price, 
 * batteryLife, processor, and warrantyPeriod. create at least two objects,
 * assign values and display their details.
 */

package com.gadget;

public class GadgetDetails {

	public static void main(String[] args) {
		System.out.println("---------First Gadget details---------");
		Gadget g = new Gadget();
		g.deviceName = "Laptop";
		g.brand = "Dell";
		g.price = 60000;
		g.batteryLife = "4 yrs";
		g.processor = "i5";
		g.warrantyPeriod = "1 yr";
		System.out.println("Device Name :" + g.deviceName);
		System.out.println("Device Brand :" + g.brand);
		System.out.println("Device Prize :" + g.price);
		System.out.println("Device Battery Life :" + g.batteryLife);
		System.out.println("Processor :" + g.processor);
		System.out.println("Warranty :" + g.warrantyPeriod);

		System.out.println("---------Second Gadget details---------");
		Gadget g1 = new Gadget();
		g1.deviceName = "TV";
		g1.brand = "Samsung";
		g1.price = 80000;
		g1.batteryLife = "4 yrs";
		g1.processor = "Crystal Processor 4K";
		g1.warrantyPeriod = "1 yr";
		System.out.println("Device Name :" + g.deviceName);
		System.out.println("Device Brand :" + g.brand);
		System.out.println("Device Prize :" + g.price);
		System.out.println("Device Battery Life :" + g.batteryLife);
		System.out.println("Processor :" + g.processor);
		System.out.println("Warranty :" + g.warrantyPeriod);
	}
}

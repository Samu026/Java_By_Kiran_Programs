package com.bill;

public class Customer {
	String customerName;
	int foodItems;
	double price;

	public Customer(String customerName, int foodItems, double price) {
		this.customerName = customerName;
		this.foodItems = foodItems;
		this.price = price;
	}

	public void displayBillDetails() {
		System.out.println("======= Customer Details =======");
		System.out.println("Customer Name   : " + customerName);
		System.out.println("Food Items Count: " + foodItems);
		System.out.println("Price per food  s: " + price);
	}

	public void calculateBill() {
		double totalBill = foodItems * price;
		double GST = (totalBill * 10 / 100);
		double paymentAmount = totalBill + GST;
		System.out.println("======= Payment Details =======");
		System.out.println("Total Bill     : " + totalBill);
		System.out.println("GST Amount     : " + GST);
		System.out.println("Payment Amount : " + paymentAmount);
	}

}

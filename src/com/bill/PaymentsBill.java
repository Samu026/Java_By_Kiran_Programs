/*6. Input customer name, number of food items, and price per item.
   Use a method to calculate total bill.
   Show GST added and total payable. */

package com.bill;

import java.util.Scanner;

public class PaymentsBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name: ");
		String customerName = sc.nextLine();

		System.out.println("Enter Food Items Count: ");
		int foodItems = sc.nextInt();

		System.out.println("Enter Price per food: ");
		double price = sc.nextDouble();

		Customer c = new Customer(customerName, foodItems, price);
		c.displayBillDetails();
		c.calculateBill();

		sc.close();
	}
}

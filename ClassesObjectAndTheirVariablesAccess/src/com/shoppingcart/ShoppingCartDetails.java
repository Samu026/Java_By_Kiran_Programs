/* Create a Shopping Cart class with instance variables cartID, 
 * userName, totalItems, totalPrice, discount, and checkoutStatus. 
 * Create at least two objects, assign values, and print their details.
 */

package com.shoppingcart;

public class ShoppingCartDetails {
	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart();
		s.cartID = 1;
		s.userName = "Samruddhi";
		s.totalItems = 5;
		s.totalPrice = 6000;
		s.discount = 40;
		s.checkoutStatus = "Invalid";
		System.out.println("----------First Item details----------");
		System.out.println("Cart ID: " + s.cartID);
		System.out.println("User Name: " + s.userName);
		System.out.println("Total Items: " + s.totalItems);
		System.out.println("Total Price: " + s.totalPrice);
		System.out.println("Discount: " + s.discount);
		System.out.println("Status: " + s.checkoutStatus);
		System.out.println();

		ShoppingCart s1 = new ShoppingCart();
		s1.cartID = 2;
		s1.userName = "Soham";
		s1.totalItems = 6;
		s1.totalPrice = 9800;
		s1.discount = 80;
		s1.checkoutStatus = "Valid";
		System.out.println("----------Second Item details----------");
		System.out.println("Cart ID: " + s1.cartID);
		System.out.println("User Name: " + s1.userName);
		System.out.println("Total Items: " + s1.totalItems);
		System.out.println("Total Price: " + s1.totalPrice);
		System.out.println("Discount: " + s1.discount);
		System.out.println("Status: " + s1.checkoutStatus);

	}
}

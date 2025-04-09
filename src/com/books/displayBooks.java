/* 3. Input book title, author, price. Use constructor to initialize.
   Display book details using a method. */

package com.books;

import java.util.Scanner;

public class displayBooks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Book Title: ");
		String title1 = sc.nextLine();

		System.out.println("Enter 1st Book Author: ");
		String author1 = sc.nextLine();

		System.out.println("Enter 1st Book Price");
		int price1 = sc.nextInt();
		sc.nextLine();

		Books b = new Books(title1, author1, price1);

		System.out.println("Enter 2nd Book Title: ");
		String title2 = sc.nextLine();

		System.out.println("Enter 2nd Book Author: ");
		String author2 = sc.nextLine();

		System.out.println("Enter 2nd Book Price");
		int price2 = sc.nextInt();
		sc.nextLine();

		Books b1 = new Books(title2, author2, price2);

		System.out.println("Enter 3rd Book Title: ");
		String title3 = sc.nextLine();

		System.out.println("Enter 3rd Book Author: ");
		String author3 = sc.nextLine();

		System.out.println("Enter 3rd Book Price");
		int price3 = sc.nextInt();

		Books b2 = new Books(title3, author3, price3);

		b.display();
		b1.display();
		b2.display();
		sc.close();

	}
}

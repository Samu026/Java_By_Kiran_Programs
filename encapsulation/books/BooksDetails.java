/* Create a class Book with private fields: bookId, title, author, price.
Use getter and setter methods to access data.
Prevent price from being set if it's less than 100. */

package encapsulation.books;

import java.util.Scanner;

public class BooksDetails {
	public static void main(String[] args) {
		Books b = new Books();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book ID: ");
		b.setBookId(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter Book Title");
		b.setTitle(sc.toString());
		sc.nextLine();

		System.out.println("Enter Book Author");
		b.setAuthor(sc.nextLine());

		System.out.println("Enter Book Price");
		b.setTitle(sc.nextLine());

		System.out.println("------- Book Details -------");
		System.out.println("Book ID    : " + b.getBookId());
		System.out.println("Book Title : " + b.getTitle());
		System.out.println("Book Author: " + b.getAuthor());
		System.out.println("Book Price : " + b.getPrice());

		sc.close();
	}
}

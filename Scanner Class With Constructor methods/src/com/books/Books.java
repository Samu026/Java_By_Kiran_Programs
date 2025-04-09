package com.books;

public class Books {
	String title;
	String author;
	int price;
	
	public Books(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display() {
		System.out.println("===============================");
		System.out.println("Book Title : "+title);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price : "+price);
	}
}
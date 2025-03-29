package com.variousfunctions;

public class Functions {
	public static void main(String args[]) {
		EvenOdd evenodd = new EvenOdd();
		evenodd.displayEvenodd(12);

		Prime prime = new Prime();
		prime.displayPrime(23);

		Palindrome palindrome = new Palindrome();
		palindrome.displayPalindrome(12121);

		Reverse reverse = new Reverse();
		reverse.displayReverse(123);

		Square square = new Square();
		square.displaySquare(3);

		Cube cube = new Cube();
		cube.displayCube(3);

	}
}

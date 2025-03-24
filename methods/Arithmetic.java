package com.methods;

public class Arithmetic {

	public static void Addition() {
		int a = 5, b = 4;
		System.out.println("Addition is :" + (a + b));
	}

	public static void Subtraction() {
		int a = 9, b = 3;
		System.out.println("Addition is :" + (a - b));
	}

	public static void Multiplication() {
		int a = 6, b = 2;
		System.out.println("Multiplication is :" + (a * b));
	}

	public static void Division() {
		int a = 80, b = 4;
		System.out.println("Division is :" + (a / b));
	}

	public static void Remainder() {
		int a = 9, b = 5;
		System.out.println("Remainder is :" + (a % b));
	}

	public static void main(String args[]) {

		Arithmetic.Addition();
		Arithmetic.Subtraction();
		Arithmetic.Multiplication();
		Arithmetic.Division();
		Arithmetic.Remainder();
	}
}

package com.operatorswitchcase;

public class Operators {
	int a;
	int b;
	char ch;

	public Operators(int a, int b, char ch) {
		this.a = a;
		this.b = b;
		this.ch = ch;
	}

	public void displayResult() {

		switch (ch) {
		case '+':
			System.out.println("Addition: " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction: " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication: " + (a * b));
			break;
		case '/':
			System.out.println("Division: " + (a / b));
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}

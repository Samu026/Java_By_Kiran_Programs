package com.variousfunctions;

public class Reverse {
	public void displayReverse(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed Number is :" + reversed);
	}
}

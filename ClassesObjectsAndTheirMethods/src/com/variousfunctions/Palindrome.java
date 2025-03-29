package com.variousfunctions;

public class Palindrome {
	public void displayPalindrome(int num) {
		int origionalnumber = num;
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;

		}
		if (origionalnumber == reversed) {
			System.out.println("Palindrome Number :" + origionalnumber);
		} else {
			System.out.println("Not Palindrome Number :" + origionalnumber);
		}

	}
}

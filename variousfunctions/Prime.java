package com.variousfunctions;

public class Prime {
	public void displayPrime(int num) {
		if (num <= 1) {
			System.out.println("Not Prime Number: " + num);
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime Number: " + num);
				return;
			}
		}

		System.out.println("Prime Number: " + num);
	}
}

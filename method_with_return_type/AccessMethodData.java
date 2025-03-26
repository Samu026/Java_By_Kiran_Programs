package com.method_with_return_type;

public class AccessMethodData {
	public static void main(String args[]) {
		int sum = mySum(1194, 30);
		System.out.println("Sum: " + sum);
		float avg = myAvg(sum);
		System.out.println("Average: " + avg);
		float discount = myDiscount(sum);
		System.out.println("Discount: " + discount);
	}

	public static int mySum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static float myAvg(int sum) {
		float avg = sum / 2;
		return avg;
	}

	public static float myDiscount(int sum) {
		float discount = sum % 10;
		return discount;
	}
}

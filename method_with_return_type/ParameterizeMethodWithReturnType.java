package com.method_with_return_type;

public class ParameterizeMethodWithReturnType {
	public static void main(String args[]) {
		int sum = displaySum(10, 20);
		int sum1 = displaySum(90, 80);
		int sum2 = displaySum(30, 50);
		System.out.println("SUM: " + sum);
		System.out.println("SUM: " + sum1);
		System.out.println("SUM: " + sum2);
		// System.out.println("SUM: "+displaySum(20,10));//----directly call without
		// storing values
	}

	public static int displaySum(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
}

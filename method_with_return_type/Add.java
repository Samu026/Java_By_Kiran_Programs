package com.method_with_return_type;

public class Add {
	public static void main(String args[]) {
		float sum = display(20, 40);
		System.out.println("Sum " + sum);
		// System.out.println("Sum "+display()); ---Without storing sum directly call by
		// SYSO
		// System.out.println("Sum "+Add.display()); ---Without storing sum directly
		// call by SYSO
	}

	public static float display(int a, int b) {
		float c = a + b;
		return c;
	}
}

package com.method_with_return_type;

public class Star {
	public static void main(String args[]) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if ((i + j) % 2 == 1) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}

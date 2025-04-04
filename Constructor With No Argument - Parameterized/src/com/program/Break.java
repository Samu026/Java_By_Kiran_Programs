/* Break keyword program (Constructor with no Argument /Parameter) */

package com.program;

public class Break {
	public static void main(String[] args) {
		Break b = new Break();
	}

	public Break() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
	}
}

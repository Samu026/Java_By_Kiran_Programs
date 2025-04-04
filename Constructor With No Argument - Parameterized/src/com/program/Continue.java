/* Continue keyword program (Constructor with no Argument /Parameter) */

package com.program;

public class Continue {
	public static void main(String[] args) {
		Continue c = new Continue();
	}

	public Continue() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
}

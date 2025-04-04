/* Check grade result using switch case with  (Constructor with no Argument /Parameter) */

package com.program;

public class SwitchCaseResult {
	public static void main(String[] args) {
		SwitchCaseResult s = new SwitchCaseResult();
	}

	public SwitchCaseResult() {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Good Result...");
			break;
		case 'B':
			System.out.println("Average Result...");
			break;
		case 'C':
			System.out.println("Pass...");
			break;
		case 'D':
			System.out.println("Fail...");
			break;
		default:
			System.out.println("Invalid Grade...");
		}
	}
}

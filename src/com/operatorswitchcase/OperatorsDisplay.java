/* 4. Input two numbers. Perform +, -, *, / operations using methods.
   Ask user which operation to perform. */

package com.operatorswitchcase;

import java.util.Scanner;

public class OperatorsDisplay {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();

		System.out.println("Enter Character Between (+, -, *, /) :");
		char ch = sc.next().charAt(0);

		Operators o = new Operators(a, b, ch);
		o.displayResult();
		sc.close();
	}
}

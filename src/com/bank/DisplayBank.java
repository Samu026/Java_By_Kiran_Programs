/* 1. Create a bank account with account holder name and initial balance.
   Deposit and withdraw money. Show current balance. */

package com.bank;

import java.util.Scanner;

public class DisplayBank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bank Holder Name:");
		String holderName = sc.nextLine();

		System.out.println("Enter Initial Balance:");
		int initialBalance = sc.nextInt();
		
		System.out.println("Enter Deposite Amount:");
		int deposite = sc.nextInt();

		System.out.println("Enter Withdraw Money Amount:");
		int withdrawMoney = sc.nextInt();

		Bank b = new Bank(holderName, initialBalance, deposite, withdrawMoney);
		b.bankDetails();
		sc.close();
	}
}

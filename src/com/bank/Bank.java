package com.bank;

public class Bank {
	String holderName;
	int initialBalance;
	int deposite;
	int withdrawMoney;

	public Bank(String holderName, int initialBalance, int deposite, int withdrawMoney) {
		this.holderName = holderName;
		this.initialBalance = initialBalance;
		this.deposite = deposite;
		this.withdrawMoney = withdrawMoney;
	}

	public void bankDetails() {
		System.out.println("Bank Holder Name: " + holderName);
		System.out.println("Initial Bank: " + initialBalance);
		System.out.println("Bank Deposite: " + deposite);
		System.out.println("Withdraw Money: " + withdrawMoney);
		System.out.println("Current Balance: " + balance());
	}

	public int balance() {
		int bankBalance = (initialBalance + deposite) - withdrawMoney;
		//System.out.println(bankBalance);
		return bankBalance;
	}
}

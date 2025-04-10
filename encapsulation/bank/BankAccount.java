package encapsulation.bank;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accNo) {
		this.accountNumber = accNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Ensure your balance is not negative");
		}
	}

	// Deposit Method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("₹" + amount + " deposited successfully.");
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Withdraw Method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("₹" + amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Method to display account details
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Current Balance: ₹" + balance);
	}
}

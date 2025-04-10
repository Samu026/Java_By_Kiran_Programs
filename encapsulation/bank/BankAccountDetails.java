/* Create a class BankAccount with private fields: accountNumber, accountHolderName, and balance.
Provide public methods to deposit, withdraw, and get balance.
Ensure that the balance cannot be set to a negative value. */

package encapsulation.bank;

public class BankAccountDetails {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();

		// Setting values
		b.setAccountNumber(12345678);
		b.setAccountHolderName("Samruddhi");
		b.setBalance(9000);

		System.out.println("--- Initial Account Details ---");
		b.displayAccountDetails();

		// Perform deposit
		System.out.println("\n--- Depositing ₹2000 ---");
		b.deposit(2000);

		// Perform withdrawal
		System.out.println("\n--- Withdrawing ₹1000 ---");
		b.withdraw(1000);

		// Display updated details
		System.out.println("\n--- Updated Account Details ---");
		b.displayAccountDetails();

	}
}

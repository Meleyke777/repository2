package task2;

abstract class BankAccount {
	private String accountNumber;
	private double balance;

	abstract void deposit(double amount);

	abstract void withdraw(double amount);
}

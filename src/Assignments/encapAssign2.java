package Assignments;

public class encapAssign2 {

	private String accountNumber;
	private double balance;
	private String owner;

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void deposit(double adds) {

		System.out.println("Amount deposited : " + adds);
		this.balance = balance + adds;
	}

	public void withdraw(double adds) {
		System.out.println("Amount Withdrawn : " + adds);
		this.balance = balance - adds;
	}

	public void printStatement() {

		System.out.println("AccountNumber	 : " + this.accountNumber);
		System.out.println("Owner name       : " + this.owner);
		System.out.println("Total Balance    : " + this.balance);
	}

	public static void main(String[] args) {

		encapAssign2 ea = new encapAssign2();

		ea.setAccountNumber("52545871277240");
		ea.setOwner("Naveen");
		ea.setBalance(1500000);

		ea.printStatement();

		ea.deposit(400000);
		ea.deposit(200000);
		ea.withdraw(100000);

		ea.printStatement();

	}

}

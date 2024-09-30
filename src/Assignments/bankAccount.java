package Assignments;

public class bankAccount {

	String accountNumber;
	double balance;

	public bankAccount(String accountNumber, double balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public void deposit(double value) {

		this.balance = balance + value;
	}

	public void withdraw(double value) {

		this.balance = balance - value;
		
	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	public static void main(String[] args) {

		bankAccount ba = new bankAccount("5425742252254", 1192200);

		ba.deposit(800000);
		ba.withdraw(200000);
		ba.deposit(10000);
		ba.deposit(800);
		ba.deposit(7000);
		ba.deposit(90000);
		ba.deposit(200000);
		ba.withdraw(100000);
		System.out.println(" updated balace:" + ba.getBalance());

	}


}

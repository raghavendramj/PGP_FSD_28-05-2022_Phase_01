package com.learning.oops;

// 100 % of abstraction!
interface RBI {
	// By default 
	//all the methods are public and abstract
	//all the variables are public static and final
	void withDraw(int amount);
	void deposit(int amount);
	int getBalance();
}

class ICICI implements RBI {

	private int balance;

	public ICICI(int bal) {
		this.balance = bal;
	}

	//Overridden the withdraw
	public void withDraw(int amount) {
		if (balance < amount) {
			System.out.println("Insufficent Funds");
			return;
		}
		balance -= amount;
		System.out.println("Amount withdrawn successfuly!");
		System.out.println("Updated Balance is : " + balance);
	}

	@Override
	public void deposit(int amount) {
		if (amount < 0) {
			System.out.println("Invalid Amount for depositing");
			return;
		}

		balance += amount;
		System.out.println("Amount depsoited successfully");
		System.out.println("Updated Balance is : " + balance);
	}

	@Override
	public int getBalance() {
		System.out.println("Balance is : " + balance);
		return this.balance;
	}
}

public class AbstractionInterfacesDemo {

}

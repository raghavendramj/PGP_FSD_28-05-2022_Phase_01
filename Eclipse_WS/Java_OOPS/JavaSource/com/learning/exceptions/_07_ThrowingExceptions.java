package com.learning.exceptions;

class Bank {
	int balance = 0;

	public Bank(int balance) {
		super();
		this.balance = balance;
	}

	public void withDraw(int amount) {
		if (balance < amount) {
			throw new IllegalArgumentException("Insufficent Funds");
		}
		balance -= amount;
		System.out.println("Amount withdrawn successfuly!");
		System.out.println("Updated Balance is : " + balance);
	}

	public void deposit(int amount) {
		if (amount < 0) {
			throw new ArithmeticException("Invalid Amount for depositing");
		}
		balance += amount;
		System.out.println("Amount depsoited successfully");
		System.out.println("Updated Balance is : " + balance);
	}
}

public class _07_ThrowingExceptions {
	public static void main(String[] args) {
		Bank icici = new Bank(10000);
		// icici.withDraw(12000);
		icici.deposit(-1);
	}
}

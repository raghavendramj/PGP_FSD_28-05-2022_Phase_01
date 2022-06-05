package com.learning.exceptions;

import java.io.IOException;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException() {
		super("EXCEPTION CONSTRUCTOR :- Insufficient Funds in your account!");
	}
}

class Account {
	float balance;

	public Account(int bal) {
		this.balance = bal;
	}

	void deposit(float value) throws IOException {
		if (value <= 0) {
			throw new IllegalArgumentException("Incorrect value to deposit");
		}
	}

	void withDraw(float value) throws InsufficientFundsException {
		if (value > balance) {
			throw new InsufficientFundsException();
		}
	}
}

public class _10_CustomExceptions {

	public static void main(String[] args) {
		try {
			Account account = new Account(5000);
			account.withDraw(10000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

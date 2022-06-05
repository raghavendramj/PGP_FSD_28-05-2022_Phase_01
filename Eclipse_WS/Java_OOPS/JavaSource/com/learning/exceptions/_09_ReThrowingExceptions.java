package com.learning.exceptions;

import java.io.IOException;

public class _09_ReThrowingExceptions {

	static class Account {
		void deposit(float value) throws IOException {
			if (value <= 0) {
				throw new IOException("Invalid Amount");
			}
		}
	}

	static void show() throws IOException {
		Account account = new Account();
		try {
			account.deposit(-1);
		} catch (IOException e) {
			//System.out.println("Something went wrong!");
			throw e; // Rethrowing the exception
		}
	}

	public static void main(String[] args) {
		try {
			show();
		} catch (IOException e) {
			System.out.println("Error is " + e.getMessage());
		}
	}

}

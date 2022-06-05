package com.learning.exceptions;

public class _05_Finally_Block {
	public static void main(String[] args) {
//		try {
//			int data = 24 / 4;
//			System.out.println("Result is : " + data);
//		} catch (ArithmeticException e) {
//			System.out.println("CATCH BLOCK:- " + e.getMessage());
//		} finally {
//			System.out.println("FINALLY BLOCK:- " + "This will be executed in all the cases.");
//		}
//		System.out.println("Rest of the code...");

		try {
			int arr[] = { 1, 2, 3 };
			System.out.println("4th Element " + arr[4]);
			// Exception -> RuntimeException -> IndexOutOfBoundException ->
			// ArrayIndexOutOfBoundsException

			int result = 25 / 0;
			System.out.println("result " + result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

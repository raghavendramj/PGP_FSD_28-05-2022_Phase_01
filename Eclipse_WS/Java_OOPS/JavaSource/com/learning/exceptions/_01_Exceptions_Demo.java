package com.learning.exceptions;

public class _01_Exceptions_Demo {

	public static void show() {
		sayHello(null);
	}

	private static void sayHello(String object) {
		System.out.println(object.toUpperCase()); //NullPointerException
	}

	public static void main(String[] args) {
		show();
	}
}

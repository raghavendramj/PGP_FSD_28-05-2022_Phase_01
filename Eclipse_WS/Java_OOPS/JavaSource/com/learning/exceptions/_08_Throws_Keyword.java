package com.learning.exceptions;

public class _08_Throws_Keyword {
	
	public static void sayHello() throws ClassNotFoundException {
		Class.forName("com.java.jdbc.Test");
	}
	
	public static void main(String[] args) {
		try {
			sayHello();
		} catch (ClassNotFoundException e) {
			System.out.println("Message "+ e.getMessage());
		}
	}
}

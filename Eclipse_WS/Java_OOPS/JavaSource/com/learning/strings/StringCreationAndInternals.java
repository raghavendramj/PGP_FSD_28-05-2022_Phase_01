package com.learning.strings;

public class StringCreationAndInternals {

	public static void main(String[] args) {
		// Ways to create strings.

		// heap
		String s2 = "WelcomeToJava"; // created in constant pool
		String s1 = new String("WelcomeToJava"); // created in the heap
		String s3 = new String("WelcomeToJava").intern(); // created in the heap -> refers to string constant pool
		System.out.println("S1's hashCode :- " + s1.hashCode());
		System.out.println("S2's hashCode :- " + s2.hashCode());
		System.out.println("S3's hashCode :- " + s3.hashCode());

		System.out.println("s1==s2 :-" + (s1 == s2));
		System.out.println("s1==s3 :- " + (s1 == s3));
		System.out.println("s2==s3 :- " + (s2 == s3));

		String name = "Sachin";
		name = name.concat("Tendulkar");
		System.out.println("Name: " + name);
		name = "Ganguly";
		System.out.println("Name: " + name);

		// String Constant Pool
		//-----------------------------
		// Sachin
		// SachinTendulkar
		// Ganguly
		
		//name => ganguly
		
		String newName = "Sachin";
	}
}

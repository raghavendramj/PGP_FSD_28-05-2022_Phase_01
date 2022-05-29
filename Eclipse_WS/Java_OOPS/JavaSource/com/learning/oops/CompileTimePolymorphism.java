package com.learning.oops;

public class CompileTimePolymorphism {

	int add(int a, int b) {
		System.out.println("2 INT PARAMS : Sum is " + (a + b));
		return a + b;
	}

	float add(float a, float b) {
		System.out.println("2 FLOAT PARAMS : Sum is " + (a + b));
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("3 PARAMS : Sum is " + (a + b + c));
		return a + b + c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphism polymorphism = new CompileTimePolymorphism();
		polymorphism.add(10, 20);
		polymorphism.add(10.45f, 20.2f);
		polymorphism.add(10, 20, 56);
	}
}

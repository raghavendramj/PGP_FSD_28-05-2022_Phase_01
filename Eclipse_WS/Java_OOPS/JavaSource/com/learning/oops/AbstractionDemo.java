package com.learning.oops;

abstract class Bike {
	abstract void run(); // abstraction achieved -> 50%

	public String getMilage() {
		return "25KMPL";
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("Running comfortably!");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Bike bike = new Honda();
		bike.run();
	}
}

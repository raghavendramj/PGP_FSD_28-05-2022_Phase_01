package com.learning.oops;

class Benz {
	public void drive() {
		System.out.println("Benz Car drives at 180KMPH");
	}
}

class Ambasidor extends Benz {
	public void drive() {
		System.out.println("Ambasidor Car drives at 70KMPH");
	}
}

public class RunTimePFOverriding {

	public static void main(String[] args) {
		Ambasidor ambasidor = new Ambasidor();
		ambasidor.drive();

		Benz benz = new Benz();
		benz.drive();

		Ambasidor obj1 = new Ambasidor();
		Benz benz2 = (Benz) obj1; //Explicit Typecasting
		Benz benz3 =  obj1; //Implicit Typecasting
		benz2.drive();

	}
}

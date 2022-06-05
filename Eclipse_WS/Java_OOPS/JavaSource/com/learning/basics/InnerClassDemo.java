package com.learning.basics;

public class InnerClassDemo {
	class Animal {
		String name;
		String foodType;

		public Animal(String name, String foodType) {
			super();
			this.name = name;
			this.foodType = foodType;
		}
	}

	public static void main(String[] args) {
		Animal animal = new Animal("Lion", "Non-Vegeterian");
	}

}

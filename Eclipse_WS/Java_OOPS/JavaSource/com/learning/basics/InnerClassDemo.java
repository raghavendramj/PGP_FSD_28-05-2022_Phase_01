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

		@Override
		public String toString() {
			return "Animal [name=" + name + ", foodType=" + foodType + "]";
		}
	}

	public static void main(String[] args) {
		InnerClassDemo object = new InnerClassDemo();
		InnerClassDemo.Animal animal = object.new Animal("Lion", "Non-Vegeterian");
		System.out.println(animal);
	}
}

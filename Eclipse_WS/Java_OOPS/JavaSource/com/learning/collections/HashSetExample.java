package com.learning.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Two"); // It will ignore the duplicate value.
		set.add(null); // It will allow this value.
		set.add(null); 
		set.add("Four");

		System.out.println("Set Contents are :- " + set);

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String nextValue = iterator.next();
			System.out.println("The current value of the set is : " + nextValue);
		}
	}
}

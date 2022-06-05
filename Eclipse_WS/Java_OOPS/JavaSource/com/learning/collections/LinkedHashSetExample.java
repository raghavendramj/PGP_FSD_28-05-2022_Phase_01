package com.learning.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("One");
		set.add("Two");
		set.add(null); // It will allow this value.
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Two"); // It will ignore the duplicate value.
		set.add(null); 
		set.add("Four");
		System.out.println("Set Contents are :- " + set);
	}

}

package com.learning.collections;

import java.util.ArrayList;

public class CollectionWithoutGenericsExample {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("Raghav");
		arrayList.add('c');
		arrayList.add(123);
		arrayList.add(true);
		System.out.println("ArrayList Contents are ... " + arrayList);
		
		String myName = (String) arrayList.get(1);
		System.out.println("My Name is : "+ myName);
	}
}

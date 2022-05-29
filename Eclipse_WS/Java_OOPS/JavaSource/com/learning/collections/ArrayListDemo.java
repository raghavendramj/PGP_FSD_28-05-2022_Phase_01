package com.learning.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Raghava");
		arrayList.add("Keshava");
		arrayList.add("Madhava");

		System.out.println("The Names are ... " + arrayList);

		// Add All
		ArrayList<Integer> collection1 = new ArrayList<>();
		collection1.add(4);
		collection1.add(5);
		collection1.add(6);
		collection1.add(1);
		collection1.add(2);
		collection1.add(3);
		System.out.println("Collection -01 " + collection1);

		ArrayList<Integer> collection2 = new ArrayList<>();
		collection2.addAll(collection1);
		System.out.println("Collection -02 " + collection2);

		// Remove
		collection1.remove(3);
		System.out.println("After removal -> Collection -01 " + collection1);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);

		// Remove All
		// list1 -> 1, 2, 3, 4 - list2 -> 2, 4 => 1, 3 (list1)
		System.out.println("\n------------ REMOVE ALL ------------------");
		System.out.println("list1 -> " + list1);
		System.out.println("list2 -> " + list2);
		list1.removeAll(list2);
		System.out.println("After removeAll list1 -> " + list1);
		System.out.println("After removeAll list2 -> " + list2);

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(7);
		list3.add(9);
		list3.add(6);
		list3.add(4);

		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(2);
		list4.add(4);

		// Retain All
		// list3 -> 1, 2, 7, 9, 6, 4 - list3 -> 2, 4 => 2, 4 (list3)
		System.out.println("\n------------ RETAIN ALL ------------------");
		System.out.println("list3 -> " + list3);
		System.out.println("list4 -> " + list4);
		list3.retainAll(list4);
		System.out.println("After retainAll list3 -> " + list3);

		list3.clear();

		System.out.println("List 3 -> " + list3);
		System.out.println("After retainAll list4 -> " + list4);

		System.out.println("\n-------------------------------------");
		ArrayList<Integer> firstList = new ArrayList<>();
		firstList.add(2);
		firstList.add(5);
		firstList.add(8);
		firstList.add(2, 56);
		firstList.add(1, 32);
		System.out.println("firstList -> " + firstList);

		boolean contains67 = firstList.contains(67);
		System.out.println("Does firstList contains 67 ? " + contains67); // false
		System.out.println("Does firstList contains 2 ? " + firstList.contains(2)); // true

		System.out.println("\n-------------------------------------");
		ArrayList<Integer> secondList = new ArrayList<>();
		secondList.add(5);
		secondList.add(2);
		// secondList.add(8);
		secondList.add(56);
		secondList.add(32);
		boolean containsAll = firstList.containsAll(secondList);
		System.out.println("Does firstList.containsAll(secondList) ? " + containsAll); // false

		Iterator<Integer> iterator = firstList.iterator();

		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println("Each Element is " + next);
		}

	}
}

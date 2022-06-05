package com.learning.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// SORTING -> ASCENDING
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Satya");
		treeSet.add("Ratnalu");
		treeSet.add("Aparna");
		treeSet.add("Biswa");
		treeSet.add("Sanat");
		treeSet.add("Aparna");
		treeSet.add("Satya");
		treeSet.add("Ratnalu");
		treeSet.add("Aparna");

		System.out.println("Treeset contents : " + treeSet);

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Treeset set contents : " + set);

		System.out.println("Highest Value : " + set.pollLast());
		System.out.println("Lowest Value : " + set.pollFirst());

		TreeSet<String> alphabets = new TreeSet<>();
		alphabets.add("G");
		alphabets.add("A");
		alphabets.add("N");
		alphabets.add("C");
		alphabets.add("B");
		alphabets.add("R");
		alphabets.add("F");
		alphabets.add("K");

		System.out.println("Initial Alphabets ASC :-  " + alphabets);
		System.out.println("HeadSet Alphabets A-F(EXCLUSIVE) :- " + alphabets.headSet("F"));
		System.out.println("HeadSet Alphabets A-F(INCLUSIVE) :- " + alphabets.headSet("F", true));
		System.out.println("subSet Alphabets C(INCLUSIVE)-K(INCLUSIVE) :- " + alphabets.subSet("C", true, "K", true));
		System.out.println("subSet Alphabets C(INCLUSIVE)-K(EXCLUSIVE) :- " + alphabets.subSet("C", "K"));
		System.out.println("Initial Alphabets DSC :- " + alphabets.descendingSet());
		
		System.out.println("\n\nInitial Alphabets ASC :-  " + alphabets);
		System.out.println("TailSet Alphabets G-R :- " + alphabets.tailSet("G"));
	}
}

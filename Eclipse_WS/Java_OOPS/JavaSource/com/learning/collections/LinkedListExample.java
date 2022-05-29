package com.learning.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> firstList = new LinkedList<>();
		firstList.add("Satya");
		firstList.add("Ratnalu");
		firstList.add("Aparna");
		firstList.add("Biswa");
		firstList.add("Sanat");
		firstList.add("Satya");

		System.out.println("****************************");
		System.out.println("After add method Linked list :- " + firstList);

		firstList.add(2, "Reetanjali");
		firstList.add(4, "Amit");
		System.out.println("****************************");
		System.out.println(" After index addition L1:- " + firstList);

		// These are specific to linked list implementation
		firstList.addFirst("Saurabh");
		System.out.println(" After addFirst L1:- " + firstList);
		System.out.println("****************************");
		firstList.addLast("Jinesh");
		System.out.println(" After addLast L1:- " + firstList);

		// Fecth Part of linked list
		System.out.println("****************************");
		System.out.println(" First element of a list. L1:- " + firstList.element());
		System.out.println("****************************");
		System.out.println(" First getFirst of a list. L1:- " + firstList.getFirst());
		System.out.println("****************************");
		System.out.println(" Last - getLast of a list. L1:- " + firstList.getLast());
		System.out.println("****************************");
		System.out.println(" Element based on index(5) L1:- " + firstList.get(5));
		System.out.println("****************************");
		System.out.println(" indexOf('Aparna') L1:- " + firstList.indexOf("Aparna"));
		System.out.println("****************************");
		System.out.println(" lastIndexOf('Satya') L1:- " + firstList.lastIndexOf("Satya"));
	}
}

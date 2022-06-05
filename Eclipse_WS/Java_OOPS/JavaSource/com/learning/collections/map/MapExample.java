package com.learning.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> employeesDetails = new HashMap<>();
		employeesDetails.put(1001, "Darshan");
		employeesDetails.put(1002, "Savon");
		employeesDetails.put(1003, "Mithun");
		employeesDetails.put(1003, "Siddu"); // Duplicate entry -> Unique Keys -> No NULL Key
		employeesDetails.put(1004, "Manjunath");
		employeesDetails.put(1005, "Savon");
		
//		1001 -> Darshan, 1002 -> Savon, 1003 -> Siddu, 1004 -> Manjunath
		
		System.out.println("Hashmap details : "+ employeesDetails);
		System.out.println("Hashmap only keys : "+ employeesDetails.keySet());
		System.out.println("Hashmap only values : "+ employeesDetails.values());
		System.out.println("Hashmap Both KEY=VALUE: "+ employeesDetails.entrySet());
		
		for(Map.Entry<Integer, String> empEntry : employeesDetails.entrySet()) {
			System.out.println("Each entry :- "+ empEntry);
		}
	}
}

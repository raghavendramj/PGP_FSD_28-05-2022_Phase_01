package com.learning.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringsDemo {

	public static void main(String[] args) {

		int numbers[] = { 3, 2, 1, 6, 4, 8, 9 };

		// For LOOP
		for (int i = 0; i < numbers.length; i++) {
			int eachElement = numbers[i];
			System.out.println("NUMBERS FOR I LOOP :- EachElement -> " + eachElement);
		}

		System.out.println("\n ******************* Using for each loop *******************");
		for (int eachNumber : numbers) {
			System.out.println("NUMBERS FOR EACH LOOP :- EachElement -> " + eachNumber);
		}

		String namesArray[] = new String[5];
		namesArray[0] = "Manjunath";
		namesArray[1] = "Thilak";
		namesArray[2] = "Keshav";
		namesArray[3] = "Richa";
		namesArray[4] = "Ranjan";

		// For EACH
		for (String eachName : namesArray) {
			System.out.println("EACH STRING : " + eachName);
		}

		char[] characters = { 's', 'i', 'm', 'p', 'l', 'i', 'l', 'e', 'a', 'r', 'n' };
		String nameOfTheInsti = new String(characters);
		System.out.println("nameOfTheInsti -> " + nameOfTheInsti);

		List<String> names = Arrays.asList(namesArray);
		Collections.sort(names);
		System.out.println("Sorted list of strings -> " + names);
	}
}

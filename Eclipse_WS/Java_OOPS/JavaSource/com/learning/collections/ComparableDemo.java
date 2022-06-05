package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(101, "Vijay", 23));
		students.add(new Student(106, "Ajay", 27));
		students.add(new Student(109, "Jai", 21));
		students.add(new Student(102, "Kishan", 26));
		students.add(new Student(10, "Manmeet", 29));
		
		System.out.println("BEFORE SORTING (AGE):- Students Infor :- "+ students);
		Collections.sort(students); //One must override the compareTo
		System.out.println("AFTER SORTING (AGE):- Students Infor :- "+ students);
	}
}

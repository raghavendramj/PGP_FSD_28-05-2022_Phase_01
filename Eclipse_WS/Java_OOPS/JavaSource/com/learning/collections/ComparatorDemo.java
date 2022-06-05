package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.age == o2.age)
			return 0;
		else if (o1.age > o2.age)
			return 1;
		else
			return -1;
	}
}

class RegComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.regNo == o2.regNo)
			return 0;
		else if (o1.regNo > o2.regNo)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(101, "Vijay", 23));
		students.add(new Student(106, "Ajay", 27));
		students.add(new Student(109, "Jai", 21));
		students.add(new Student(102, "Kishan", 26));
		students.add(new Student(104, "Manmeet", 29));

		System.out.println("BEFORE SORTING (AGE):- Students Infor :- " + students);
		Collections.sort(students, new RegComparator());
		System.out.println("\n\nAFTER SORTING (AGE):- Students Infor :- " + students);
	}
}

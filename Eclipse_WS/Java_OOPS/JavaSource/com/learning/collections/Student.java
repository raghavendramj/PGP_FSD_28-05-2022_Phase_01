package com.learning.collections;

public class Student implements Comparable<Student>{
	int regNo;
	String name;
	int age;

	public Student(int regNo, String name, int age) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nStudent [regNo=" + regNo + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student student) {
		if(this.age == student.age)
			return 0;
		else if(this.age > student.age)
			return 1;
		else 
			return -1;
	}
}

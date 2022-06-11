package com.learning.file.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialzationDemo {
	static String fileName = "new_students.ser";

	static class Student implements Serializable {
		private static final long serialVersionUID = 1L;
		private int id;
		private String name;

		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
	}

	static void serialzieObject() {
		Student johnDoe = new Student(1, "John Doe");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
			out.writeObject(johnDoe);
			out.flush();
			out.close();

			System.out.println("Writing successful");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void deSerialzieObject() {
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileInputStream);
			Student myStudent = (Student) in.readObject();
			System.out.println(myStudent);
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// serialzieObject();
		deSerialzieObject();
	}

}

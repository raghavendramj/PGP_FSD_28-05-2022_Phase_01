package com.learning.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _02_TypesOfException {

	// Checked/CompileTime Exceptions
	// 1. FileNotFound
	// 2.ClassNotFoundException
	// 3.IOException
	static void readFile() {
		try {
			FileReader fileReader = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
		}

		try {
			Class.forName("com.oracle.JDBCDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream inpStream = new FileInputStream(new File("newFile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// UnChecked/Runtime Exceptions
	// 1.NullPointer
	// 2.Arithmetic
	// 3.IllegalArgument
	// 4.IndexOutOfBound
	// 5.IllegalState
	static void show() {
		sayHello(null);
	}

	static void sayHello(String object) {
		System.out.println(object.toUpperCase()); // NullPointerException
	}

	public static void main(String[] args) {
		show();
	}
}

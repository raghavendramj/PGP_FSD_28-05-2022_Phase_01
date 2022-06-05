package com.learning.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _04_MultipleExceptionCatching {
	
	static String FILE_PATH = "C:\\Users\\DELL\\Desktop\\OnlineClasses\\Simplilearn\\PGP\\Phase_01\\Projects\\Java_OOPS\\JavaSource\\com\\learning\\exceptions\\file.txt";

	public static void readFile() {
		try {
			//CHECKED :- 1. FileNotFoundException -> Handled 
			FileReader fileReader = new FileReader(FILE_PATH);
			
			//CHECKED :- 2. ClassNotFoundException -> Handled
			Class.forName("com.learning.exceptions._01_Exceptions_Demo");
			
			//UNCHECKED :- 3. Arithmetic Exception java.lang.ArithmeticException: / by zero
			int b = 12/45;
			
			System.out.println("Continued with execution.");
			
			
		} catch (FileNotFoundException | ClassNotFoundException | ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}

	public static void main(String[] args) {
		readFile();
	}

}

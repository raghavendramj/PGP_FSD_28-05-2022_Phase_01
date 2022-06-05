package com.learning.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _03_HowToHandleException {

	static void readFile() {
		try {
			FileReader fileReader = new FileReader("C:\\Users\\DELL\\Desktop\\OnlineClasses\\Simplilearn\\PGP\\Phase_01\\Projects\\Java_OOPS\\JavaSource\\com\\learning\\exceptions\\file.txt");
		
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Please wait while we load file...");
		}
	}

	public static void main(String[] args) {
		readFile();
	}

}

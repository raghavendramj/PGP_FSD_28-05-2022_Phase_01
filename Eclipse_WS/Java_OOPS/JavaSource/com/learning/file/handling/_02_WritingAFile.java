package com.learning.file.handling;

import java.io.FileWriter;
import java.io.IOException;

public class _02_WritingAFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("simpli.txt");
			myWriter.write("File handling in java is been discussed");
			myWriter.close();
			System.out.println("Contents successfully written into the file");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

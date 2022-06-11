package com.learning.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _04_DeletingTheFile {

	static String fileName = "newFileToDelete.txt";

	static void createFile() {
		try {
			File file = new File(fileName);
			if (file.createNewFile()) {
				System.out.println("File created " + file.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void writeToFile() {
		try {
			FileWriter myWriter = new FileWriter(fileName);
			myWriter.write("File handling in java is been discussed");
			myWriter.close();
			System.out.println("Contents successfully written into the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void readFile() {
		try {
			File fileObj = new File(fileName);
			Scanner scanner = new Scanner(fileObj);
			while (scanner.hasNextLine()) {
				String currentData = scanner.nextLine();
				System.out.println("Read contents from the file is :- " + currentData);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void deleteFile() {
		try {
			File fileObj = new File(fileName);

			if (fileObj.delete()) {
				System.out.println("Delete the file : " + fileObj.getName());
			} else {
				System.out.println("Failed to delete the file.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		createFile();
		writeToFile();
		readFile();
		deleteFile();
	}
}

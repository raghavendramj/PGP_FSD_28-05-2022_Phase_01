package com.learning.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _03_ReadingFromAFile {

	public static void main(String[] args) throws FileNotFoundException {

		File fileObj = new File("simpli.txt");
		Scanner scanner = new Scanner(fileObj);

		while (scanner.hasNextLine()) {
			String currentData = scanner.nextLine();
			System.out.println("Read contents from the file is :- " + currentData);
		}

		if (fileObj.exists()) {
			System.out.println("File name: " + fileObj.getName());
			System.out.println("Absolute path: " + fileObj.getAbsolutePath());
			System.out.println("Writeable: " + fileObj.canWrite());
			System.out.println("Readable " + fileObj.canRead());
			System.out.println("File size in bytes " + fileObj.length());
		} else {
			System.out.println("The file does not exist.");
		}

		scanner.close();
	}
}

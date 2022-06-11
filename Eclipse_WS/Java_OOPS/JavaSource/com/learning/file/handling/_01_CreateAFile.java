
package com.learning.file.handling;

import java.io.File;
import java.io.IOException;

public class _01_CreateAFile {

	public static void main(String[] args) {
		try {
			File file = new File("simpli.txt");
			if (file.createNewFile()) {
				System.out.println("File created " + file.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

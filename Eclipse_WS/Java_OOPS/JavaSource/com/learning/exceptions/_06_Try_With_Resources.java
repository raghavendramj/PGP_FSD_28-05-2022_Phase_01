package com.learning.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _06_Try_With_Resources {
	static class Employee implements Serializable {

		private int employeeId;
		private String name;
		private String email;

		public Employee(int employeeId, String name, String email) {
			this.employeeId = employeeId;
			this.name = name;
			this.email = email;
		}

		public Employee() {
		}
	}

	public static void writeToAFileWithoutTWR() throws IOException {

		FileOutputStream myFileOutStream = null;
		ObjectOutputStream out = null;
		try {
			myFileOutStream = new FileOutputStream("employee.ser"); // FNF
			out = new ObjectOutputStream(myFileOutStream); // IO

			Employee employee = new Employee(123, "Raghav", "raghav@gmail.com");
			out.writeObject(employee);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (myFileOutStream != null) {
				myFileOutStream.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	public static void writeToAFileWithTWR() {

		try (FileOutputStream myFileOutStream = new FileOutputStream("employee.ser");
				ObjectOutputStream out = new ObjectOutputStream(myFileOutStream);) {
			Employee employee = new Employee(123, "Raghav", "raghav@gmail.com");
			out.writeObject(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
//		writeToAFileWithoutTWR();
		writeToAFileWithTWR();
	}
}

package com.learning.oops;

public class TypeCasting {

	public static void main(String[] args) {

		// Widening Typecasting..
		// byte -> short -> int -> long -> float -> double

		int x = 7; // 4bytes
		long y = x; // Automatic Typecasting 8 bytes
		float z = y;

		System.out.println("Before conversion, int value " + x);
		System.out.println("After conversion, long value " + y);
		System.out.println("After conversion, float value " + z);

		// NarrowingTypeCasting

		double d = 1524545.562356;
		long l = (long) d; // There is possiblity of data loss
		int i = (int) l;
		
		System.out.println("\n-----------------------------------------");

		System.out.println("Before conversion, double value " + d);
		System.out.println("After conversion, long value " + l);
		System.out.println("After conversion, int value " + i);

	}

}

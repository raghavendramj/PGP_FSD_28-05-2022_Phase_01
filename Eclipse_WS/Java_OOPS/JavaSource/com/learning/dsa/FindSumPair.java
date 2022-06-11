package com.learning.dsa;

import java.util.Arrays;

public class FindSumPair {

	static void findSumPairBruteForce(int arr[], int targetSum) {
		for (int i = 0; i < arr.length; i++) {
			int firstNumber = arr[i];
			for (int j = 0; j < arr.length; j++) {
				int secondNumber = arr[j];
				if (firstNumber+ secondNumber == targetSum && i != j) {
					System.out.println("The Sum pair is : [ " + firstNumber+ ", " + secondNumber+" ]");
				}
			}
		}
		// Time Complexity :-  + O(n^2)
	}

	static void findSumPairUsingSorting(int arr[], int targetSum) {
		// Sort the array.
		Arrays.sort(arr); // MegreSort -> Best Complexity.. -> O(nlogn)
		// binary search (log(n))
		
		System.out.println("Sorted array is " );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {

			// Base codition
			if (arr[low] + arr[high] == targetSum) {
				System.out.println("The Sum pair is : [" + arr[low] + ", " + arr[high]+" ]");
			}

			if (arr[low] + arr[high] < targetSum)
				low++; // Move right,
			else
				high--; // move left
		}

		// System.out.println("Sum Pairt now found!");
		// Time Complexity :- nlogn(Sorting) + logn(Binary Search) => nlogn
	}

	public static void main(String[] args) {
		 findSumPairBruteForce(new int[] { 5, 3, 6, 8, 9, 7, 1, 4 }, 12);
		findSumPairUsingSorting(new int[] { 5, 3, 6, 8, 9, 7, 1, 4 }, 12);
	}
}

package org.tnsif.coodingchallenge;
/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 * Find all unique triplets in the array which give the sum of zero.

Note: The solution set must not contain duplicate triplets.

Example: Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]*/

public class ThreeSum {

	public static void main(String[] args) {

		int arr[] = { -1, 0, 1, 2, -1, -4 };
		int n = arr.length;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i] + "," + arr[j] + "," + arr[k]);
						System.out.println();
					}

				}
			}
			

		}

	}

}

package org.tnsif.generic_class;

import java.util.Arrays;

public class ArrayOperations {
	public static <E> void display(E values[]) {
		for (E ele : values) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static <E> void sortArray(E values[]) {
		Arrays.sort(values);
	}
}

package com.noorteck.java.hw24;

public class HomeworkQ1 {

	static boolean isFirstLast(int[] number) {
		boolean result = false;

		if (number[0] == 6 || number[number.length - 1] == 6) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] array1 = { 6, 1, 2, 3 };
		int[] array2 = { 13, 6, 1, 2, 3 };
		int[] array3 = { 0, 1, 4, 3, 6 };
		int[] array4 = { 0, 6, 0 };
		System.out.println(isFirstLast(array1));
		System.out.println(isFirstLast(array2));
		System.out.println(isFirstLast(array3));
		System.out.println(isFirstLast(array4));
	}

}

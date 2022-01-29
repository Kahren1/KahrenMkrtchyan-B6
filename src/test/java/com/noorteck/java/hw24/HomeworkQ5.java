package com.noorteck.java.hw24;

import java.util.Arrays;

public class HomeworkQ5 {

	private int[] getDouble(int[] number) {

		int[] result = new int[number.length * 2];

		result[result.length - 1] = number[number.length - 1];

		return result;
	}

	public static void main(String[] args) {
		// testing with Test data

		int[] array1 = { 6, 1, 2, 3 };
		int[] array2 = { 13, 3 };
		int[] array3 = { 0, 1, 4 };
		int[] array4 = { 6 };

		HomeworkQ5 obj = new HomeworkQ5();
		System.out.println(Arrays.toString(obj.getDouble(array1)));
		System.out.println(Arrays.toString(obj.getDouble(array2)));
		System.out.println(Arrays.toString(obj.getDouble(array3)));

		int[]result = obj.getDouble(array4);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}

}

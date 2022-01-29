package com.noorteck.java.hw24;

public class HomeworkQ6 {

	protected static boolean checkNum(int[] number) {
		boolean result = false;
		int fiveCount = 0;
		int twoCount = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 5) {
				fiveCount++;
			}else if (number[i] == 2) {
				twoCount++;
			}
		}

		if (fiveCount == 2 || twoCount == 2) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] array1 = { 6, 1, 2, 3 };
		int[] array2 = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int[] array3 = { 3, 3, 0, 1, 4, 3, 6 };
		int[] array4 = { 2, 6, 2 };

		//testing with Test Data
		System.out.println(checkNum(array1)); //false
		System.out.println(checkNum(array2));//true
		System.out.println(checkNum(array3));//false
		System.out.println(checkNum(array4));//true
	}

}

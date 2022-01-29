package com.noorteck.java.hw24;

public class HomeworkQ2 {

	protected boolean sameFirstLast(char[] c) {
		boolean result = false;

		if (c.length > 1 && c[0] == c[c.length - 1]) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		HomeworkQ2 obj = new HomeworkQ2();
//testing with Test Data
		char[] array1 = { 'a', 'b', 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char[] array2 = { 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char[] array3 = { 'e', 'd', 'a', 'd', 'e', 'q', 'a', 'e' };
		char[] array4 = { 'a' };

		System.out.println(obj.sameFirstLast(array1));
		System.out.println(obj.sameFirstLast(array2));
		System.out.println(obj.sameFirstLast(array3));
		System.out.println(obj.sameFirstLast(array4));
	}

}

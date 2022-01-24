package com.noorteck.java.hw22;

public class HomeworkQ5 {
	public static void main(String[] args) {

		System.out.println(removeSpace(null));
		System.out.println(removeSpace("  Java Training       "));
		System.out.println(removeSpace("I like to practice     "));

	}

	public static String removeSpace(String strOne) {
		String result = null;
		if (strOne != null) {
			result = strOne.trim();
		}
		return result;
	}
}

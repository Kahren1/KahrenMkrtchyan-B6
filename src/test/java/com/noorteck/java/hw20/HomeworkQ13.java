package com.noorteck.java.hw20;

public class HomeworkQ13 {

	boolean isStartWith(String strOne, String strTwo) {
		boolean result = false;
		if (strOne.startsWith(strTwo)) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		// testing with Test Data
		HomeworkQ13 obj = new HomeworkQ13();

		System.out.println(obj.isStartWith("java training", "ing"));
		System.out.println(obj.isStartWith("java training", "ja"));
		System.out.println(obj.isStartWith("java training", "java"));
		System.out.println(obj.isStartWith("java training", "train"));

	}

}

package com.noorteck.java.hw20;

public class HomeworkQ15 {

	public static String removeSpace(String strOne) {
		String result;

		result = strOne.trim();

		return result;
	}

	public static void main(String[] args) {

		System.out.println(removeSpace("Java Training     "));
		System.out.println(removeSpace("      I like to practice    "));

	}

}

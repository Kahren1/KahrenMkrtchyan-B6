package com.noorteck.java.hw22;

public class HomeworkQ4 {
	public static void main(String[] args) {

		System.out.println(getSubStr(null, 2, 6));
		System.out.println(getSubStr("java training", 2, 6));
		System.out.println(getSubStr("Software Development Engineer in TEST", 11, 23));
		System.out.println(getSubStr("Software Development Engineer in TEST", 21, 29));

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String str1 = null;

		if (str != null) {
			str1 = str.substring(startingIndex, endingIndex);

		}

		return str1;

	}

}

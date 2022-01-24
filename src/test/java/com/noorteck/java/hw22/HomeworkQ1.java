package com.noorteck.java.hw22;

public class HomeworkQ1 {
	public static void main(String[] args) {
		String str1 = "Pro";
		String str2 = "java";
		String str3 = null;

		HomeworkQ1 hwq1 = new HomeworkQ1();

		System.out.println(hwq1.toUpper("Pro"));
		System.out.println(hwq1.toUpper("java"));
		System.out.println(hwq1.toUpper(null));
	}

	String toUpper(String strOne) {
		String result = "";
		if (strOne != null) {
			result = strOne.toUpperCase();
		} else {
			result = null;
		}
		return result;
	}
	
}

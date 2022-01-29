package com.noorteck.java.hw20;

public class HomeworkQ16 {

	String concatString(String strOne, String strTwo) {
		String result = strOne + strTwo;
		if (strOne.charAt(strOne.length() - 1) == strTwo.charAt(0)) {
			result = strOne + strTwo.substring(1);
		}
		return result;
	}

	
	public static void main(String[] args) {
		// testing with test data

		HomeworkQ16 obj = new HomeworkQ16();
		System.out.println(obj.concatString("Java", "awesome"));
		System.out.println(obj.concatString("food", "door"));
		System.out.println(obj.concatString("java", "training"));
		System.out.println(obj.concatString("Pro", "ogress"));

	}
}

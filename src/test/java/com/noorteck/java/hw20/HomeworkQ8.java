package com.noorteck.java.hw20;

public class HomeworkQ8 {

	// in the Q8 task there should be a condition of indexNum being equal to the
	// String length, not just indexNum>strOne.length()
	// I wrote indexNum>=strOne.length() to prevent StringIndexOutOfBoundsException
	// exception being thrown

	public static char getCharacter(String strOne, int indexNum) {
		char result;

		if (indexNum >= strOne.length()) {
			result = '?';
		} else {
			result = strOne.charAt(indexNum);
		}

		return result;
	}

	public static void main(String[] args) {

		// testing with Test Data
		System.out.println(getCharacter("java training", 2));
		System.out.println(getCharacter("java training", 5));
		System.out.println(getCharacter("java training", 8));
		System.out.println(getCharacter("java training", 22));

	}

}

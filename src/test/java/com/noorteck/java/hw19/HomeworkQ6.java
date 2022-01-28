package com.noorteck.java.hw19;

public class HomeworkQ6 {
//there is a typo in the Q6 task: parameter3 is given twice, first time as strThree, then on the line below as strFour
	// it should typed as parameter 4
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result;

		strOne = strOne.toUpperCase();
		strThree = strThree.toUpperCase();
		strTwo = strTwo.toLowerCase();
		strFour = strFour.toLowerCase();

		result = strOne + strTwo + strThree + strFour;

		return result;
	}

	public static void main(String[] args) {

		// testing with Test Data
		System.out.println(combineStr("day", "ONE", "work", "HOURS"));
		System.out.println(combineStr("week", "weekend", "monday", "Tuesday"));
		System.out.println(combineStr("restoN", "vA", "baltiMORE", "MD"));
		System.out.println(combineStr("java", "is", "fun", "LEARNING"));

	}
}

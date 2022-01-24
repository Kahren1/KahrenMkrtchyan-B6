package com.noorteck.java.hw22;

public class HomeworkQ2 {
	public static void main(String[] args) {
		
		HomeworkQ2 hwq2 = new HomeworkQ2();
		
		System.out.println(hwq2.isEndWith("java training", "ing"));
		System.out.println(hwq2.isEndWith("java training", "ng"));
		System.out.println(hwq2.isEndWith("java training", "java"));
		System.out.println(hwq2.isEndWith("java training", "train"));
		
		System.out.println(hwq2.isEndWith(null, "java"));
		System.out.println(hwq2.isEndWith(null, null));
		System.out.println(hwq2.isEndWith("aaabc", "abc"));
		System.out.println(hwq2.isEndWith("abc", null));
		
		
	}

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;
		if (strOne != null && strTwo != null) {
			if (strOne.endsWith(strTwo)) {
				result = true;
			}
		}
		return result;
	}


}

package com.noorteck.java.hw20;

public class HomeworkQ14 {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result;
		result = str.substring(startingIndex, endingIndex);
		
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getSubStr("java training", 2,6));
		System.out.println(getSubStr("Software Development Engineer in TEST", 11, 23));
		System.out.println(getSubStr("Software Developemnt Engineer in TEST", 21, 29));
	}
	
}

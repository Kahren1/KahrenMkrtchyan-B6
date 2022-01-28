package com.noorteck.java.hw19;

public class HomeworkQ9 {

	private boolean isThere(String strOne, String strTwo) {
		boolean result = false;
		if (strOne.contains(strTwo)) {
			result=true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		//testing with Test Data
		
		HomeworkQ9 obj = new HomeworkQ9();
		System.out.println(obj.isThere("java training", "ini"));
		System.out.println(obj.isThere("java training", "ava"));
		System.out.println(obj.isThere("java training", "AVA"));
		System.out.println(obj.isThere("java training", "Java"));
	}

}

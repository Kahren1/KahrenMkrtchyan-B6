package com.noorteck.java.hw19;

public class HomeworkQ4 {

	String toUpper(String strOne) {
		String result;

		result = strOne.toUpperCase();

		return result;
	}
	
	public static void main(String[] args) {
		//testing using test data
		
		HomeworkQ4 obj = new HomeworkQ4();
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper("java training"));
	}

}

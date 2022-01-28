package com.noorteck.java.hw19;

public class HomeworkQ1 {
	static boolean isEqual(String strOne, String strTwo) {
		boolean result=false;
		
		if(strOne.equals(strTwo)){
			result=true;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		HomeworkQ1 obj = new HomeworkQ1();
		//testing using test data
		
		System.out.println(isEqual("sdet", "SDET"));
		System.out.println(isEqual("testing", "testing"));
		System.out.println(isEqual("java", "java"));
		System.out.println(isEqual("java", "java programming"));
		
	}

}

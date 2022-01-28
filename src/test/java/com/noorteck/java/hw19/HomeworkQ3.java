package com.noorteck.java.hw19;

public class HomeworkQ3 {
	public static void isEqualLength(String strOne, String strTwo) {
		String newStr;
		if(strOne.length()== strTwo.length()) {
			System.out.println(strOne+strTwo+ " "+ strOne.length()*2);
		}else if(strOne.length()>strTwo.length()) {
			System.out.println(strOne.toUpperCase()+ " " + strOne.length());
		}else {
			System.out.println(strTwo.toLowerCase()+ " "+ strTwo.length());
		}
	
	}
	
	public static void main(String[] args) {
		//testing using test data
		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
		
	}
	
	

}

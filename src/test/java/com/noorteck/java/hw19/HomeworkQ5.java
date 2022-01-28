package com.noorteck.java.hw19;

public class HomeworkQ5 {
	
	protected String toLower(String strOne) {
		String result;
		
		result= strOne.toLowerCase();
		
		return result;
	}
	
	public static void main(String[] args) {
		
		HomeworkQ5 obj = new HomeworkQ5();
	System.out.println(obj.toLower("espn"));
	System.out.println(obj.toLower("SOCCER"));
	System.out.println(obj.toLower("STRING CLASS"));
	}

}

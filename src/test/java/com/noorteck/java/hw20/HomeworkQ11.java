package com.noorteck.java.hw20;

public class HomeworkQ11 {
	protected String threeEqual(String str, char oldChar, char newChar) {
		String result;
		
		result=str.replace(oldChar, newChar);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		//testing with Test Data
		
		HomeworkQ11 obj = new HomeworkQ11();
		System.out.println(obj.threeEqual("Java Pro", 'P','B'));
		System.out.println(obj.threeEqual("Lazy mode", 'm','C'));
		System.out.println(obj.threeEqual("Training", 'T',' '));
	}

}

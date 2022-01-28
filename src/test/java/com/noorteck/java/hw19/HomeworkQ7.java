package com.noorteck.java.hw19;

public class HomeworkQ7 {
	
	String helloTo(String strOne) {
		String result;
		
		result = "Hello "+strOne;
		
		return result;
	}
	
	public static void main(String[] args) {
		//testing with Test Data
		
		HomeworkQ7 obj = new HomeworkQ7();
		
		System.out.println(obj.helloTo("Denis"));
		System.out.println(obj.helloTo("Malek"));
		System.out.println(obj.helloTo("Sara"));
	}

}

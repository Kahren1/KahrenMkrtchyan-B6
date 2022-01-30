package com.noorteck.java.hw12;

public class HomeworkQ2 {

	boolean multipleOf(int x) {
		boolean result = false;
		if (x % 5 == 0 || x % 3 == 0) {
			return true;
		}

		return result;
	}
	
	public static void main(String[] args) {
		HomeworkQ2 obj= new HomeworkQ2();
		System.out.println(obj.multipleOf(3));
		System.out.println(obj.multipleOf(10));
		System.out.println(obj.multipleOf(8));
	}

}

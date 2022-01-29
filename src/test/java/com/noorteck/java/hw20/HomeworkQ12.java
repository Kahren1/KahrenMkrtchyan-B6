package com.noorteck.java.hw20;

public class HomeworkQ12 {
	
	public static void replaceStr(String strOne, String oldStr, String newStr) {

		strOne = strOne.replace(oldStr, newStr);

		System.out.println(strOne);
	}

	public static void main(String[] args) {
		//testing with Test Data
		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");
	}


}

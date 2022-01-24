package com.noorteck.java.hw22;

public class HomeworkQ3 {
	public static void main(String[] args) {
		
		HomeworkQ3 hwQ3 = new HomeworkQ3();
		System.out.println(hwQ3.threeEqual(null, "P", "B"));
		System.out.println(hwQ3.threeEqual("Java Pro", "P", "B"));
		System.out.println(hwQ3.threeEqual("Lazy mode", "m", "C"));
		System.out.println(hwQ3.threeEqual("Training", "T", " "));

		
		
		
	}
	
	protected String threeEqual (String str, CharSequence oldChar, CharSequence newChar) {
		String result= null;
		
		if(str!=null) {
			if(str.contains(oldChar)) {
				str=str.replace(oldChar, newChar);
			}
			result=str;
		}
		
		
		return result;
	}
	
	

}

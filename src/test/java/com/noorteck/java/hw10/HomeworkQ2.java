package com.noorteck.java.hw10;

public class HomeworkQ2 {
	
	public static void getGender(char gender) {
		
		if(gender!='m'&&gender!='f'&& gender!='M'&&gender!='F') {
			System.out.println("Error: '"+gender + "' entered. Enter 'm' or 'M' or 'f' or 'F'");
			
		}else if(gender== 'm' || gender == 'M') {
			System.out.println("Male");
		}else
			System.out.println("Female");
	}
	
	public static void main(String[] args) {
		//testing
		getGender('a');
		getGender('M');
		getGender('f');
		
	}

}

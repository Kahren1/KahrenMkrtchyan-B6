package com.noorteck.java.hw08;

public class HomeworkQ5 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=32;i++) {
			if(i%2==0&&i>=2&&i<=5) {
				System.out.println("Even number 2-5 : "+ i);
			} if(i%2==0&&i>=6&&i<=20) {
				System.out.println("Even number 6-20 : " + i);
			}if(i%2==1&&i>=15&&i<=20) {
				System.out.println("Odd number 15-20 : "+i);
			}
		}
	}

}

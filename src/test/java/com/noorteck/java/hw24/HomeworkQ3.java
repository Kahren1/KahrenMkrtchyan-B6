package com.noorteck.java.hw24;

public class HomeworkQ3 {
	public static int getTotal(int[] number) {
		int result=0;
		
		for(int i=0;i<number.length;i++) {
			result+=number[i];
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[]arr1 = {6,1,2,3};
		int[]arr2 = {13, 6, 1, 2, 3};
		int[] arr3 = {0,1,4,3,6};
		int[] arr4 = {0,6,0};
		
		System.out.println(getTotal(arr1));//12
		System.out.println(getTotal(arr2));//25
		System.out.println(getTotal(arr3));//14
		System.out.println(getTotal(arr4));//6
		
		
		
	}

}

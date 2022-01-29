package com.noorteck.java.hw24;

import java.util.Arrays;

public class HomeworkQ4 {
	
	int[] getFirstLast(int[]number) {
		int[] result = new int[2];
		
		result[0]= number[0];
		result[1]=number[number.length-1];
	
		return result;
	}
	
	
	public static void main(String [] args) {
		
		//testing with Test Data
		int[]arr1 = {6,1,2,3};
		int[] arr2 = {13,6,1,2,3};
		int[]arr3 = {0,1,4,3,6};
		int[] arr4 = {0,6,0};
		
		HomeworkQ4 obj = new HomeworkQ4();
		System.out.println(Arrays.toString(obj.getFirstLast(arr1)));
		System.out.println(Arrays.toString(obj.getFirstLast(arr2)));
		System.out.println(Arrays.toString(obj.getFirstLast(arr3)));
		
		int[]newArr=obj.getFirstLast(arr4);
		for(int i=0; i<newArr.length;i++) {
			System.out.print(newArr[i]+ " ");
		}
		
		
	}

}

package com.noorteck.java.hw12;

public class HomeworkQ1 {
	
	boolean posNeg(int var1, int var2, boolean var3) {
		boolean result = false;
		
		if((var1<0^var2<0)&&var3==false) {
			result=true;
		}else if(var1<0&&var2<0&&var3==true) {
			result=true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		HomeworkQ1 obj = new HomeworkQ1();
		System.out.println(obj.posNeg(1, -1, false));
		System.out.println(obj.posNeg(-1,1,false));
		System.out.println(obj.posNeg(-4,-5, true));
	}

}

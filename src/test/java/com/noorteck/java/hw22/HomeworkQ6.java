package com.noorteck.java.hw22;

public class HomeworkQ6 {
	public static void main(String[] args) {
		HomeworkQ6 hwq6 = new HomeworkQ6();
		System.out.println(hwq6.endsWithNG(null));
		System.out.println(hwq6.endsWithNG("I like to practice"));
		System.out.println(hwq6.endsWithNG("Everyone is practicing"));
		System.out.println(hwq6.endsWithNG("I am studying"));

	}

	public boolean endsWithNG(String strOne) {
		boolean result = false;
		if (strOne != null && strOne.endsWith("ng")) {
			result = true;
		}

		return result;
	}

}

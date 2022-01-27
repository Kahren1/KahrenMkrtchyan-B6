package com.noorteck.java.hw10;

public class HomeworkQ1 {

	void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		double result=0;

		if (mathOperationSign != '+' && mathOperationSign != '-' && mathOperationSign != '/' && mathOperationSign != '*'
				&& mathOperationSign != '%') {
			System.out.println("Error. Enter one of the following Java arithmetic operators: +, -, /, *, or %");
		} else {
			
			switch(mathOperationSign) {
			case '+':
				result = numOne+numTwo;
				break;
			case '-':
				result =numOne-numTwo;
				break;
			case '/':
				result = numOne/numTwo;
				break;
			case '*':
				result= numOne*numTwo;
				break;
			case '%':
				result=numOne%numTwo;
				break;
			}
			System.out.println(numOne +""+ mathOperationSign +""+ numTwo +"="+result );
		}

	}

	public static void main(String[] args) {
		//testing
		HomeworkQ1 hwq1 = new HomeworkQ1();
		hwq1.calculate(5, 2, 'b');
	}

}

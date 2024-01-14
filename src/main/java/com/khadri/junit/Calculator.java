package com.khadri.junit;

public class Calculator {

	public Integer add(int a, int b) {
		if(a >= 100 && b >= 100) {
			return a+b;
		}
		return 0;
	}

	public Integer sub(int a, int b) {
		return a - b;
	}

	public Integer multi(int a, int b) {
		return a * b;
	}

	public Integer division(int a, int b) {
		return a / b;
	}
	
	public boolean isEqualTo(String input) {
		return input.equals("hello");
	}

}

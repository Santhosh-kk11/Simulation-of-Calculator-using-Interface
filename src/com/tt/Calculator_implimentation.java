package com.tt;

public class Calculator_implimentation implements Calculator {

	@Override
	public int add(int a,int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a,int b) {
		
		return a-b;
	}

	@Override
	public int mul(int a,int b) {
		
		return a*b;
	}
	

	@Override
	public int div(int a, int b) {
		
			return a/b;
		}
		

	@Override
	public String displayErrorMessage() {
		return "invalid operation";
	}

}

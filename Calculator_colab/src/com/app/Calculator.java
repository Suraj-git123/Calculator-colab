package com.app;

public class Calculator {
	
	public int add(int a , int b) {
		int c = a + b;
		return c;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int i = c.add(10, 20);
		System.out.println("Addition :" + i);
	}

}

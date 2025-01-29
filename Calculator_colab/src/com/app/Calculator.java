package com.app;

public class Calculator {
	
	public int add(int a , int b) {
		int c = a + b;
		return c;
	}
	public int sum(int a,int b){
		int c=a-b;
		return c;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int i = c.add(10, 20);
		int x = c.sum(20,10);
		System.out.println("Addition :" + i);
		System.out.println("Subtraction :"+ z);
		
	}

}

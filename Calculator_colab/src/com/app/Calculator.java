package com.app;

public class Calculator {
	
	public int add(int a , int b) {
		int c = a + b;
		return c;
	}
	public int sub(int a,int b){
		int c=a-b;
		return c;
	}
	
	public int mul(int a , int b)
	{
		int c = a*b;
		return c;
	}
	
	public int div(int p , int q)
	{
		int r = p/q;
		return r;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int i = c.add(10, 20);
		int x = c.sub(20,10);
		int	y = c.mul(2,4);
		int z = c.div(2,11);
		System.out.println("Addition :" + i);
		System.out.println("Subtraction :"+x);
		System.out.println("Multiplication :"+y);
		System.out.println("Division :"+z);
		
	}

}

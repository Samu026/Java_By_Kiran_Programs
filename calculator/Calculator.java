package com.calculator;

public class Calculator {
	public static void main(String args[]) {
		Addition add=new Addition();
		add.myAddition(10,20);
		
		Subtraction sub=new Subtraction();
		sub.mySubtraction(90,70);
		
		Multiplication mul=new Multiplication();
		mul.myMultiplication(50,3);
		
		Division div=new Division();
		div.myDivision(90,30);
	}
}

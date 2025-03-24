/* Write a method that takes an integer as a parameter and print 
 * whether it is positive, Negative, zero. 
 * call the method using the class name */

package com.methods;

public class TypesNum {
	public static void main(String args[]) {
		TypesNum.numberIdentify(376);
	}
	public static void numberIdentify(int num) {
		if(num>0) {
			System.out.println("Positive Number is :"+num);
		}else if(num<0) {
			System.out.println("Negative Number is :"+num);
		}else{
			System.out.println("Number is :"+num);
		}
	}
}

package com.base;

public class annotation {

	public static void main(String[] args) {
		String a = "ram";
		String b = "kumar";

		System.out.println("**Before Exchange**");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);

		a = a + b;
		b = a.substring(0, (a.length() - b.length()));
		a = a.substring(b.length());

		System.out.println("**After Exchange**");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);

	}

}
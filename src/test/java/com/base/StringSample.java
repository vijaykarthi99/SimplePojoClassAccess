package com.base;

public class StringSample {

	public static void main(String[] args) {
		String s = "Welcome java vijaymani";
		String s1 = "welcome Selenium vijaymani";

		// STRINGS METHODS
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("j"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("l"));
		System.out.println(s.endsWith("v"));
		System.out.println(s.contains("o"));
		// System.out.println(s.split("java"));
		System.out.println(s.substring(5));
		System.out.println(s.replace("java", "SQL"));
		System.out.println(s.trim());
		// String[] split = s.split(s1);
		// System.out.println(split);
		//
		// String op=" ";
		// String[] split = s.split(op);
		// for (String x : split) {
		// String rev=" ";
		// for (int i = x.length()-1; i>=0; i--) {
		// rev=rev+x.charAt(i);
		// }
		// op=op+rev+" ";
		// }
		// System.out.println(op);

		// interchange with s into s1
		s = s + s1;
		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(s1.length());

		System.out.println(s);
		System.out.println(s1);

		//String Reverce Concept
		String op = " ";

		String[] split = s.split(op);

		for (String c : split) {

			String rev = " ";
			for (int i = c.length() - 1; i >= 0; i--) {
				rev = rev + c.charAt(i);

			}
			op = op + rev + " ";
		}

		System.out.println(op);
		System.out.println("*********************************");
//		String a="*";
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("********************************");
String a= "A";

s1="";
			for (int i = 0; i <=s1.length(); i++) {
				for (int j = 0; j <i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		
	}

}

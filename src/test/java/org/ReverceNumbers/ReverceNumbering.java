package org.ReverceNumbers;

public class ReverceNumbering {
	static int a, b, c, rev, count,sum,temp;

	public static void main(String[] args) {
		a = 1212121;
		temp=a;
		rev=0;
		count=0;
		sum = 0;
		while (a > 0) {
			b = a / 10; // quotient
			c = a % 10; // reminder
			rev = c + (rev * 10);
			a = b;
		
				
					
				
			count++;
			sum=sum+c;
		}
		if(temp==rev) {
			System.out.println("polindrom numbers"
					+ "");
		}else{
			System.out.println("not a polindrom");
		}
		System.out.println("no of digits: " + count);
		System.out.println("no of sum: " + sum);


	}

}

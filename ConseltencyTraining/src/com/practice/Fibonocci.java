package com.practice;
/*Fibonacci series (solution) Write a simple Java program
 *  which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . ...
 */
public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1,n2=1;
		int n3;
		System.out.print(n1+" "+n2);
		
		for(int i=0;i<=20;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
				System.out.print(" "+n3);
		}
		
	}

}

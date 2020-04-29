package com.practice;

import java.util.Scanner;

/*Write a Java program to 
 * check if a given number is prime or not.
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s=args[0];
//		
//		int num=Integer.parseInt(s);
//		if(!((num%3==0) || (num%2==0))) {
//			System.out.println("given num is prime");
//		}else
//		{
//			System.out.println("Number is not prime");
//		}
//		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number I will say given number is prime or not");
		int num=input.nextInt();
		if(!((num%3==0) || (num%2==0))) {
			System.out.println("given num is prime");
		}else
		{
			System.out.println("Number is not prime");
		}
		input.close();
		
		
	}

	
}

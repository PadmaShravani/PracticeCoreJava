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
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter a number I will say given number is prime or not");
//		int num=input.nextInt();
//		if(!((num%3==0) || (num%2==0))) {
//			System.out.println("given num is prime");
//		}else
//		{
//			System.out.println("Number is not prime");
//		}
//		input.close();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number I will say given number is prime or not");
		int n=input.nextInt();
	//	int n=7;
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime==true) 
			System.out.println("Prime number");
		else
				System.out.println("Not Prime");
		
		input.close();
		
		
	}

	
}

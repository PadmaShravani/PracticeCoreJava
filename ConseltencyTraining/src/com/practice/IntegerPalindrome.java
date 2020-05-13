package com.practice;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a num ");
		int num=input.nextInt();
		
		int remainder,reversenum = 0,originalnum;
		originalnum=num;
		while(num>0) {
		remainder=num%10;
		reversenum=(reversenum*10)+remainder;
		System.out.println(reversenum);
		num=num/10;
		System.out.println(num);
		}
		if(originalnum==reversenum)
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
		input.close();
	}

}

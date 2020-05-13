package com.practice;

import java.util.Scanner;

/*you have two strings s1 and s2 you must check if s1 is a sub string of s2
 */
public class StringQuestion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of first string between 1 and 100");
		int n = input.nextInt();
		System.out.println("Enter length of second string between 1 and 100");
		int k = input.nextInt();
		System.out.println("Enter string 1 and 2");
		String str1 = input.next();
		String str2 = input.next();
		if ((str1.length() == n) && (str2.length() == k)) 
		{
			if (str2.contains(str1)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}else {
		//	System.out.println(str1.length()+" "+n+" and "+str2.length()+" "+k);
			System.out.println("String length is not correct");
		}
		input.close();
	}

}

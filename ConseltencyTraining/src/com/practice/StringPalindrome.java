package com.practice;

import java.util.Scanner;

/*write a simple Java program to check if a given String is palindrome or not. 
 */
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any word i can say if it is palindrome or not");
		String word=input.next();
		input.close();
		String rWord = "";
		for(int i=word.length()-1;i>=0;i--)
		rWord=rWord+word.charAt(i);		
		
		if(word.equals(rWord))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		
	}

}

package com.practice;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n=0;
//		System.out.println("Enter a num");
//		try(Scanner input=new Scanner(System.in)){
//			n=input.nextInt();
//		}
		Scanner input=new Scanner(System.in);
		int n=0;
		System.out.println("Enter a num");
		try {
			n=input.nextInt();
		}
		
		catch(Exception e) {
			System.out.println("Error");
		}
//		finally
//		{
//			input.close();
//			System.out.println("closed");
//		}
	}

}

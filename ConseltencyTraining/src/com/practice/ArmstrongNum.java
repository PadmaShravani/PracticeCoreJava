package com.practice;
/*A number is called an Armstrong number if it is equal to the
 * cube of its every digit. For example, 153 is an Armstrong number
 * because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. 
 * You need to write a program to check if the given number is 
 * Armstrong number or not. 
 */
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,num2;
		int a,b,c;
		a=num/100;
		b=(num/10)%10;
		c=num%10;
		System.out.println(a+" "+b+" "+c);
		//num2=(a*a*a)+(b*b*b)+(c*c*c);
		num2=(int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c , 3));	
		if(num==num2)
		System.out.println("armstrong num");
		else
			System.out.println(("Not an Armstrong Num"));
	}

}

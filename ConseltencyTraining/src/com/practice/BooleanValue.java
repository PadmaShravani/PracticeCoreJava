package com.practice;

public class BooleanValue {
		
			public static void main(String[] args) 
			{
//				int[] a = new int[3];
//				a[0]='a';
//				a[1]='b';
//				System.out.println(a[0]+a[1]+a[2]);
				
				
				Boolean b1 = Boolean.valueOf(null);
				Boolean b2 = Boolean.valueOf(false);
				System.out.println(b1);
				System.out.println(b2);
				System.out.println((false==false));
				
				System.out.print((b1 == b2)+" ");
			
				System.out.print(b1.equals(b2));
				
			}
			
			
}

//class Demo
//{
//	String title ="Demo";
//}
//public class Test 
//{
//	public static void m1(Demo d)
//	{
//		d.title = "NewDemo";
//	}
//	public static void main(String[] args) 
//	{
//		Demo d =new Demo();
//		m1(d);
//		System.out.println(d.title);
//	}
//}
package com.practice;

import java.util.HashMap;
import java.util.Map;

public  class LearningInterview {
 int x=5;
 
	public static void main(String[] args) throws Exception {
		
		int a=10;
		String s="Shravani";
		Map<String,String> phonebook=new HashMap<String,String>();
		
		phonebook.put("shravani","463555");

	//	System.out.println(x+"static value ");
//		Test t=new Test();
//		System.out.println(t.toString()
//				+" hash code "+t.hashCode()+" equals "+t.equals(t)
//				+" hash code "+t.hashCode()+" class name"+t.getClass());
//	Test1 t1=new Test1();
//	System.out.println();
//	//t.notify();
//	t1.notify(); 
//	t1.wait();
//	System.out.println();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		
		System.out.println(x+"   "
				+ ""+result);
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LearningInterview other = (LearningInterview) obj;
		if (x != other.x)
			return false;
		return true;
	}
	
}
//class Test{
//	
//}
//
//class Test1 extends Thread{
//	public void run() {
//	System.out.println("Hi");
//}

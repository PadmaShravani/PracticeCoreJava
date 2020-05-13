package com.practice;

import java.util.HashMap;
import java.util.Map;

public class sample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//String s= "Satish";
//String s2 = "Satish";
//String s3 = "Satish";
//s2.toUpperCase();
//s = s.toUpperCase();
//
//System.out.println(s.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println(dk.hashCode());
		DataKey dk1 =  (DataKey) dk.clone();
		System.out.println(dk.getName());
//		dk.setId(2);
//		dk.setName("Satish");
//		System.out.println(dk.hashCode());
		
		
//		Map<DataKey, Integer> hm = getAllData();
//
//		DataKey dk = new DataKey();
//		dk.setId(1);
//		dk.setName("Pankaj");
//		System.out.println(dk.hashCode());
//		//hm.put(dk, 11);
//		Integer value = hm.get(dk);
//
//		System.out.println(value);
//
//	}
//	
//	
//	private static Map<DataKey, Integer> getAllData() {
//		Map<DataKey, Integer> hm = new HashMap<>();
//
//		DataKey dk = new DataKey();
//		dk.setId(1);
//		dk.setName("Pankaj");
//		System.out.println(dk.hashCode());
//
//		hm.put(dk, 10);
//
//		return hm;
	}

}

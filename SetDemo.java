package com.telstra.day6.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		String name1="john";
//		String name2="manish";
//		String name3="rohan";
//		String name4="rahul";
//		
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());
		
		HashSet<String> fruits = new HashSet();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		System.out.println(fruits);
		
		LinkedHashSet<String> fruits2 = new LinkedHashSet();
		fruits2.add("mango");
		fruits2.add("apple");
		fruits2.add("banana");
		fruits2.add("mango");
		
		System.out.println(fruits2);
		
		TreeSet<String> fruits3 = new TreeSet();
		fruits3.add("mango");
		fruits3.add("apple");
		fruits3.add("banana");
		fruits3.add("mango");
		
		System.out.println(fruits3);
		
		
		

	}

}

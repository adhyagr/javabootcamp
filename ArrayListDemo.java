package com.telstra.day6.collection;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj= new ArrayList();
		System.out.println("size before adding"+" "+obj.size());
		
		obj.add(1);
		obj.add("hello");
		obj.add(12.43);
		obj.add("hi");
		
		System.out.println("size after adding"+" "+obj.size());
		
		System.out.println("object from list"+" "+obj);
		obj.set(2, "java");
		
		System.out.println("object from list"+" "+obj);
		obj.remove(2);
		
	System.out.println("object from list"+" "+obj);
	
	System.out.println("object contain"+" "+obj.contains("hello"));
		
	obj.clear();
		System.out.println("object from list after clear"+" "+obj);
		
	}

}

package com.telstra.day6.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("rohit");
		batch1.add("john");
		batch1.add("ankit");
		batch1.add("sourab");
		batch1.add("rahul");
		System.out.println(batch1);
		
		ArrayList<String> batch2 = new ArrayList<String>();
		batch2.add("anil");
		batch2.add("mansa");
		batch2.add("rohit");
		batch2.add("rahul");
		batch2.add("karan");
		System.out.println(batch2);
		
		batch1.removeAll(batch2);
		System.out.println(batch1);
		
		batch1.addAll(batch2);
		System.out.println(batch1);
	
		
		Collections.sort(batch1);
		System.out.println(batch1);

	}

}

package com.telstra.day6.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItertorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println("nums="+" "+nums);
		
		ListIterator<Integer> listitr = nums.listIterator();
		System.out.println("forward");
		
		while(listitr.hasNext()) {
		System.out.println(listitr.next());

	}
		
		System.out.println("backward");
		
		while(listitr.hasPrevious()) {
		System.out.println(listitr.previous());
		}

	}

}

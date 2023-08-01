package com.telstra.day6.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println("nums="+" "+nums);
		
		Collections.sort(nums);
		System.out.println("nums="+" "+nums);
		
		Collections.reverse(nums);
		System.out.println("nums="+" "+nums);
		
		System.out.println("min"+" " +Collections.min(nums));

	}

}

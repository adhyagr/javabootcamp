package com.telstra.day6.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Cusorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println("nums="+" "+nums);
		
		Iterator<Integer> itr = nums.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

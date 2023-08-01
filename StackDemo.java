package com.telstra.day6.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> nums= new Stack();
		nums.add(1);
		nums.add(2);
		nums.push(3);
		System.out.println(nums);
		
		nums.pop();
		System.out.println(nums);
		nums.pop();
		System.out.println(nums);

	}

}

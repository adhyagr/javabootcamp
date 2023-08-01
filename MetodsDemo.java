package com.telstra.day6.collection;

import java.util.ArrayList;

public class MetodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		System.out.println(num1);
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(11);
		num2.add(12);
		num2.add(13);
		num2.add(14);
		System.out.println(num2);
		num2.addAll(num1);
		System.out.println(num2);
		
		num2.retainAll(num1);
		System.out.println(num2);
		
		

	}

}

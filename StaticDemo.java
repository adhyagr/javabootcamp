package com.telstra.day5.practice;

public class StaticDemo {
	static {
		System.out.println("this is static1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main");


	}
	static {
		System.out.println("this is static2");
	}
}

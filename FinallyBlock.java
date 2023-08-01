package com.telstra.day5.exception;

public class FinallyBlock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the");
		try {
		System.out.println(2/0);
		}
		catch (NullPointerException e){
		System.out.println("somthing went wrong");
		}
		finally {
		System.out.println("hello");
		}

	}

}



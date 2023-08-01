package com.telstra.day5.exception;



public class Exceptionhandle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the");
		try {
		System.out.println(2/2);
		}
		catch (NullPointerException e){
		System.out.println("somthing went wrong");
		}
		System.out.println("hello");

	}

}



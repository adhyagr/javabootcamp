package com.telstra.day5.exception;
import java.util.Scanner;

public class ExceptionPractice {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("eneter no");
		int number= scn.nextInt();
		// TODO Auto-generated method stub
		System.out.println("the");
		try {
		System.out.println(number/0);
		}
		catch (NullPointerException e){
		System.out.println("somthing went wrong");
		}
		finally {
		System.out.println("hello");
		}

	}

}

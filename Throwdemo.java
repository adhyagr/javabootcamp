package com.telstra.day4.exception;

import java.io.IOException;

class User{
	public void checkEligiblity(int age){
		//throw at runtime ,unchecked
		if (age>=18)
			System.out.println(" you are eligible");
		else 
			throw new ArithmeticException("your are not eligible ");//object creation
	}
	public void checkEligiblity2(int age) throws IOException {
		//throw at compile time ,checked
		if (age>=18)
			System.out.println(" you are eligible");
		else 
			throw new IOException("your are not eligible ");
		
	}
}

public class Throwdemo {
	public static void main(String[] args) throws IOException {
		User user = new User();
		try{
		user.checkEligiblity(12);
		user.checkEligiblity2(12);
		}
		catch( Exception e){
			System.out.println(" someting went wrong");
		}
		
	}

}

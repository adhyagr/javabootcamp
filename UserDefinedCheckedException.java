package com.telstra.day5.exception;
class  UserInValiedException extends Exception{
	String msg;
	
	public UserInValiedException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
class Customer2{
	public void checkEligiblity(int age) throws UserInValiedException {
		
		if (age>=18)
			System.out.println(" you are eligible");
		else 
			throw new UserInValiedException("your are not eligible ");
	}
}

public class UserDefinedCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer2 customer2 = new Customer2();
		try {
			customer2.checkEligiblity(12);
		}
		catch (UserInValiedException e) {
			System.out.println(e.getMsg());
		}

	}

}

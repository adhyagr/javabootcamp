package com.telstra.day5.exception;

class  InValiedAgeException extends RuntimeException{
	String msg;
	public InValiedAgeException(String msg) {
		super();
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	
}
class Customer{
	public void checkEligiblity(int age){
		
		if (age>=18)
			System.out.println(" you are eligible");
		else 
			throw new InValiedAgeException("your are not eligible ");
	}
}
public class UserDefinedException {
	public static void main(String[] args) {
		Customer customer = new Customer();
		try {
			customer.checkEligiblity(32);
		}
		catch (InValiedAgeException e) {
			System.out.println(e.getMsg());
		}
		}

}

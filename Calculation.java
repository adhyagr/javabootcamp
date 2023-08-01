package com.telstra;

public class Calculation {
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int substraction(int a,int b)
	{
		return a-b;
	}
	public boolean checkEligiblity(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

}

package com.telstra.day5.overridding;

class Bank{
	void holiday() {
		System.out.println("2nd and 4th sat holiday");
		
	}
	void Dailylimit() {
		
		System.out.println("1 lakh");
		
	}

}
class SBI extends Bank{
void Dailylimit() {
		
		System.out.println("2 lakh");
		
	}
void sbirule() {
	
	System.out.println("all day working");
	
}
	
}
class Axis extends Bank{
	
}
public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi =new SBI();// it has access to both parent and child
		sbi.Dailylimit();
		sbi.holiday();
		sbi.sbirule();
		System.out.println("==================================================");
		Bank sbi2 =new Bank();
		sbi2.Dailylimit();
		sbi2.holiday();
		//sbi2.sbirule()

	}

}

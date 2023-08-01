package com.telstra.day5.inetrfacae;
import com.telstra.day5.payments.Payments;
import com.telstra.day5.payments.Upi;


public class Sevice {
	Payments pay;
	public Sevice() {
		pay = new Upi();
		
	}
	public void payment() 
	{
		pay.payments();
		System.out.println("payment login");
		
	}
}

package com.telstra.day5.loselycoupling;

interface Bank{// in abstract we dont have body in subclass we need to provide body
	int salary =5000;
	void Greet();
	
}
interface RBI extends Bank{
	void Greet();
	//void AtmGuidelines();
}
class Axis implements RBI{

	@Override
	public void Greet() {
		// TODO Auto-generated method stub
		
	}

	
	

	/*
	 * @Override public void Greet() { // TODO Auto-generated method stub
	 * System.out.println("welcome all.....");
	 * 
	 * }
	 * 
	 * @Override public void AtmGuidelines() { // TODO Auto-generated method stub
	 * System.out.println("pin safe rule.");
	 * 
	 * }
	 */
	
	
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis axis= new Axis();
		axis.Greet();
		//axis.AtmGuidelines();
		//Bank bank = new Axis;
		

	}

}

package com.telstra.day5.loselycoupling;

interface Breakfast{
	void eat();
	void make();
	
}
class idly implements Breakfast{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(" eating idly");
		
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("  steam");
		
		
	}
	
}
class dosa implements Breakfast{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(" eating dosa");
		
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println(" put on pan");
		
		
	}
	
}
public class looselycoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Breakfast breakfast =new idly();
		breakfast.eat();
		breakfast.make();


	}

}

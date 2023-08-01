package com.telstra.day5.practice2;

class Flipkart{
	void filter() {
		System.out.println(" default");
	}
	void filter( int Price) {
		System.out.println(" filter by price");
	}
	void filter(String Brand) {
		System.out.println(" filter by brand");
	}
	void filter( int Price, String Brand) {
		System.out.println(" filter by price and brand ");
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart flipkart =new Flipkart();
		flipkart.filter();
		flipkart.filter(100);
		flipkart.filter("apple");
		flipkart.filter(200, "asd");

	}

}

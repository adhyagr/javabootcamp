package com.telstra.day5.practice;
class Parent{
	int id;
	public Parent() {
		System.out.println(" default Parent constructor");
	}
	public Parent(int id) {
		System.out.println("Parent constructor"+ id);
	}
	
}
class Child extends Parent{
	public Child(int id) {
		super (3);
		System.out.println("child constructor");
	}
	
}


public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(4);

	}

}

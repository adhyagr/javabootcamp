package com.telstra.day5.practice;

class Emp{
	int id;
	String name;
	static String dept;
	
}

public class Employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp.dept="developer";
		
		Emp e1=new Emp();
		e1.id=1;
		e1.name="sachin";
		e1.dept="dept1";
		
		Emp e2=new Emp();
		e2.id=1;
		e2.name="sachin";
		e2.dept="dept2";
		
		System.out.println(e1.id+" "+e1.name+" "+e1.dept);
		System.out.println(e2.id+" "+e2.name+" "+e2.dept);
		

	}

}

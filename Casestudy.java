package com.telstra.day4.practice;
import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.println("enter times");
		int num2=scan2.nextInt();
		for(int i=1;i<=num2;i++) {
			System.out.println(num+"*"+i+"="+num*i);
			
		}

	}

}

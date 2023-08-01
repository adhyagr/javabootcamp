package com.telstra.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.telstra.Calculation;

public class Calculationtest {
	
	@Test
	public void testcalculation() {
		
		Calculation calculation = new Calculation();
		
		assertEquals(5,calculation.addition(3, 2));
		System.out.println("========test addition=========");
		
	}
	@Test
public void testsubstraction() {
		
		Calculation calculation = new Calculation();
		
		assertEquals(1,calculation.substraction(3, 2));
		System.out.println("========test substraction=========");
		
	}
	@Test
	public void eligiblitytest() {
		
		Calculation calculation = new Calculation();
		assertFalse(calculation.checkEligiblity(34));
		System.out.println("========test eligibity=========");
		
	}
	@Before
	public void test1() {
		System.out.println("========run before test =========");
		
	}
	@After
	public void test2() {
		System.out.println("========run after test =========");
		
	}
	@BeforeClass
	public static void test3() {
		System.out.println("========run before class =========");
	}
	@AfterClass
	public static void test4() {
		System.out.println("========run before class =========");
	}
	

}

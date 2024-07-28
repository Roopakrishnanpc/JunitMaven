package com.junit.learning.JunitMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//without jupiter
//import static org.junit.Assert.*;
//
//import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
//		System.out.println("First Junit run");
//		assertEquals("Java","Java");
		Calc c=new Calc();
		int actual=c.divide(10, 5);
		int expectedResult=3;
		assertEquals(expectedResult,actual);
	}
}
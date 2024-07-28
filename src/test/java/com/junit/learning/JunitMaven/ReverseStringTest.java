package com.junit.learning.JunitMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		ReverseString reverse=new ReverseString();
		//right clickon actual -> refractor -> inline so it will directly take the actual you dont need to create new agsin and again
		String actualop=reverse.reverseString("Java");
		String actual=reverse.reverseString("Java");
		String expect="avaJ";
		assertEquals(expect, actual);
		assertEquals("Alien",reverse.reverseString("neilA"));
		
	}
	@Test
	void test1() {
		//fail("Not yet implemented");
		ReverseString reverse=new ReverseString();
		String actual=reverse.reverseString("Java");
		String expect="avaJ";
		assertEquals(expect, actual);
	}
}
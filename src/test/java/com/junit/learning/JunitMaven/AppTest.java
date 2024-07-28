package com.junit.learning.JunitMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		assertEquals("hello", "hello"); // fail
	}

}

package com.junit.learning.JunitMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ShapeTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void testComputerSqaureArea() {
		Shape s=new Shape();
		double actual=s.areaOfSquare(10);
		double expected=100;
		assertEquals(expected, actual);
	}
	@Test
	void testComputeCirclearea() {
		Shape s=new Shape();
		double actual=s.cirleOfArea(5);
		double expected=78.5;
		assertEquals(expected, actual);
	}
	@Test
	void testComputeCirclearea_Supplierinterface() {
		Shape s=new Shape();
		double actual=s.cirleOfArea(5);
		double expected=78.5;
		//here we are giving message using suplier interface see message in failure incase of failure
		assertEquals(expected, actual, () -> "area of circle is wrong");
	}

}

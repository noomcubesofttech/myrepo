package test;

import static org.junit.Assert.*;

import org.junit.Test;

import math.Mathematics;

public class NoomMathTest {

	@Test
	public void testMain() {
		
		
	
	}

	@Test
	public void testPlus() {
		Mathematics math1 = new Mathematics();
		assertEquals(7, math1.plus(3, 4),0);
		
	}

	@Test
	public void testMinus() {
		
		Mathematics math1 = new Mathematics();
		assertEquals(8, math1.minus(12, 4),0);
	}

	@Test
	public void testMultiply() {
		Mathematics math1 = new Mathematics();
		assertEquals(30, math1.multiply(5, 6),0);
	}

	@Test
	public void testDivision() {
		Mathematics math1 = new Mathematics();
		assertEquals(7, math1.division(70, 10),0);
	}

	@Test
	public void testPower() {
		Mathematics math1 = new Mathematics();
		assertEquals(8, math1.power(2, 3),0);
	}

}

package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import math.Mathematics;

public class MathTest {

	@Test
	public void testPlus() {
		
		    Mathematics tester = new Mathematics(); 
		    
		    assertEquals("2 + 3 must be 5", 0, tester.plus(2, 3));
		    assertEquals("7 + 4 must be 11", 0, tester.plus(7, 4));
		    
	}

	@Test
	public void testMinus() {
	    Mathematics tester = new Mathematics(); 
	    
	    assertEquals("10 - 3 must be 7", 0, tester.minus(10, 3));
	    assertEquals("23 - 4 must be 19", 0, tester.minus(23, 4));

	}

	@Test
	public void testMultiply() {
		
		Mathematics tester = new Mathematics();
		assertEquals("11 * 3 must be 33", 0, tester.multiply(11, 3));
	    assertEquals("22 * 4 must be 88", 0, tester.multiply(22, 4));

	}

	@Test
	public void testDivision() {
		
		Mathematics tester = new Mathematics();
		assertEquals("20 / 5 must be 4", 0, tester.division(20, 5));
	    assertEquals("16 / 2 must be 8", 0, tester.division(16, 2));

	}

	@Test
	public void testPower() {
		
		Mathematics tester = new Mathematics();
		assertEquals("2 ^ 5 must be 32", 0, tester.power(2, 5));
	    assertEquals("3 ^ 4 must be 81", 0, tester.power(3, 4));
	}

	/*
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void testDivideByZero() {
		 
		 Mathematics tester = new Mathematics();
		 assertEquals("7 / 0 must be Error", 0, tester.division(7, 0));
		 
	    }
	*/
}

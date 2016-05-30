package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import math.Mathematics;



public class MathTest {

	@Test
	public void testPlus() {
		
		    Mathematics tester = new Mathematics(); 
		    
		    assertEquals(5,  tester.plus(2, 3),0);
		    assertEquals(11, tester.plus(7, 4),0);
		    
	}

	@Test
	public void testMinus() {
	    Mathematics tester = new Mathematics(); 
	    
	    assertEquals(7, tester.minus(10, 3),0);
	    assertEquals(19,tester.minus(23, 4),0);

	}

	@Test
	public void testMultiply() {
		
		Mathematics tester = new Mathematics();
		assertEquals(33, tester.multiply(11, 3),0);
	    assertEquals(88, tester.multiply(22, 4),0);

	}

	@Test
	public void testDivision() {
		
		Mathematics tester = new Mathematics();
		assertEquals(4, tester.division(20, 5),0);
	    assertEquals(8, tester.division(16, 2),0);

	}

	@Test
	public void testPower() {
		
		Mathematics tester = new Mathematics();
		assertEquals(32, tester.power(2, 5),0);
	    assertEquals(81, tester.power(3, 4),0);
	}

	
}

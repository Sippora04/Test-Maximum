package com.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void testIntegerMax_MaxAtFirstPosition() {
		boolean flag;
		if ((Maximum.maximum(5, 0, 1)).equals(5)) {
			flag = true;
		} else {
			flag = false;
		}
	assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMax_MaxAtSecondPosition() {
		boolean flag;
		if ((Maximum.maximum(63, 99, 42)).equals(99)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testIntegerMax_MaxAtThirdPosition() {
		boolean flag;
		if ((Maximum.maximum(76, 23, 50)).equals(76)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMax_MaxAtFourParameters() {
		boolean flag;
		if ((Maximum.maximum(63, 99, 42, 1)).equals(99)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMax_MaxAtFirstPosition() {
		boolean flag;
		if ((Maximum.maximum(8.4f, 4.6f, 7.5f)).equals(8.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMax_MaxAtSecondPosition() {
		boolean flag;
		if ((Maximum.maximum(4.6f, 9.4f, 1.5f)).equals(9.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testFloatMax_MaxAtThirdPosition() {
		boolean flag;
		if ((Maximum.maximum(1.5f, 4.6f, 98.4f)).equals(98.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMax_MaxAtFourParameter() {
		boolean flag;
		if ((Maximum.maximum(3.2f, 5.6f, 1.5f,10.0f)).equals(10.0f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	
	@Test
	public void testStringMax_MaxAtFirstPosition() {
		boolean flag;
		if ((Maximum.maximum("Peach", "Apple", "Banana")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testStringMax_MaxAtSecondPosition() {
		boolean flag;
		if ((Maximum.maximum("Apple", "Peach", "Banana")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testStringMax_MaxAtThirdPosition() {
		boolean flag;
		if ((Maximum.maximum("Apple", "Banana", "Peach")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testStringMax_MaxAtFourParameters() {
		boolean flag;
		if ((Maximum.maximum("Apple", "Banana", "Peach", "Orange")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
}

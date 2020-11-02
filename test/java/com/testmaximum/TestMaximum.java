package com.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void testIntegerMax_MaxAtFirstPosition() {
		Integer max = Maximum.findIntegerMaximum(5, 0, 1);
		boolean flag;
		if (max.equals(5)) {
			flag = true;
		} else {
			flag = false;
		}
	assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMaxWithMaxAtSecondPosition() {
		Integer max = Maximum.findIntegerMaximum(63, 99, 42);
		boolean flag;
		if (max.equals(99)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtThirdPosition() {
		Integer max = Maximum.findIntegerMaximum(76, 23, 50);
		boolean flag;
		if (max.equals(76)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
}

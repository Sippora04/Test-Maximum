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
	public void testIntegerMax_MaxAtSecondPosition() {
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
	public void testIntegerMax_MaxAtThirdPosition() {
		Integer max = Maximum.findIntegerMaximum(76, 23, 50);
		boolean flag;
		if (max.equals(76)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMax_MaxAtFirstPosition() {
		Float max = Maximum.findFloatMaximum(8.4f, 4.6f, 7.5f);
		boolean flag;
		if (max.equals(8.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaxWithMaxAtSecondPosition() {
		Float max = Maximum.findFloatMaximum(4.6f, 9.4f, 1.5f);
		boolean flag;
		if (max.equals(9.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtThirdPosition() {
		Float max = Maximum.findFloatMaximum(1.5f, 4.6f, 98.4f);
		boolean flag;
		if (max.equals(98.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
}

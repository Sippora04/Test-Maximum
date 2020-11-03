package com.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void testIntegerMax_MaxAtFirstPosition() {
		Integer max = Maximum.maximum(5, 0, 1);
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
		Integer max = Maximum.maximum(63, 99, 42);
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
		Integer max = Maximum.maximum(76, 23, 50);
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
		Float max = Maximum.maximum(8.4f, 4.6f, 7.5f);
		boolean flag;
		if (max.equals(8.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMax_MaxAtSecondPosition() {
		Float max = Maximum.maximum(4.6f, 9.4f, 1.5f);
		boolean flag;
		if (max.equals(9.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testFloatMax_MaxAtThirdPosition() {
		Float max = Maximum.maximum(1.5f, 4.6f, 98.4f);
		boolean flag;
		if (max.equals(98.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
	
	@Test
	public void testStringMax_MaxAtFirstPosition() {
		String max = Maximum.maximum("Peach", "Apple", "Banana");
		boolean flag;
		if (max.equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testStringMax_MaxAtSecondPosition() {
		String max = Maximum.maximum("Apple", "Peach", "Banana");
		boolean flag;
		if (max.equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtThirdPosition() {
		String max = Maximum.maximum("Apple", "Banana", "Peach");
		boolean flag;
		if (max.equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		assertEquals(true, flag);
	}
}

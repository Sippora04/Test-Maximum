package com.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void testIntegerMax_hMaxAtFirstPosition() {
		Integer max = Maximum.findMaximum(50, 40, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
	assertEquals(true, flag);
	}
}

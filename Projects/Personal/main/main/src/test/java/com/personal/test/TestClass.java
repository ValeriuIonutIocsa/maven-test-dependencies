package com.personal.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.utils.test.TestInputUtils;

public class TestClass {

	@Test
	public void testInput() {

		Assertions.assertEquals(1, TestInputUtils.parseTestInputNumber("1"));
	}
}

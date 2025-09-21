package com.personal.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.utils.test.TestInputUtils;

class LibClassTest {

	@Test
	void testLibMethod() {

		String str;
		String otherStr;
		boolean expectedResult;
		int input = TestInputUtils.parseTestInputNumber("1");
		if (input == 1) {
			str = "Abcdef";
			otherStr = "ABC";
			expectedResult = true;

		} else if (input == 2) {
			str = "Xyz";
			otherStr = "ABC";
			expectedResult = false;

		} else {
			throw new RuntimeException();
		}

		boolean result = LibClass.libMethod(str, otherStr);
		Assertions.assertEquals(expectedResult, result);
	}
}

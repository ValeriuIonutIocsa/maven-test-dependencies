package com.personal.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicEvenNumberTest {

	@TestFactory
	List<DynamicTest> testEvenNumbers() {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		return numbers.stream()
				.map(n -> DynamicTest.dynamicTest(
						"Test if " + n + " is even",
						() -> testEvenNumbersCommon(n)))
				.collect(Collectors.toList());
	}

	private static void testEvenNumbersCommon(
			int n) {

		System.out.println("testing number " + n);
		Assertions.assertEquals(0, n % 2);
	}
}

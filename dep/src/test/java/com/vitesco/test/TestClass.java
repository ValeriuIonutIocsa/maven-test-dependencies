package com.vitesco.test;

import org.junit.jupiter.api.Test;

public class TestClass {

	@Test
	public void add() {

        final int result = LibTestClass.libAdd(12, 4);
        System.out.println("1111 " + result);
    }
}

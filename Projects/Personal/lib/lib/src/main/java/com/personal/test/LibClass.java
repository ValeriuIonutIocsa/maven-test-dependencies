package com.personal.test;

import org.apache.commons.lang3.Strings;

public class LibClass {

	public static final String MESSAGE = "message";

	public static boolean libMethod(
			final String str,
			final String otherStr) {

		return Strings.CI.startsWith(str, otherStr);
	}
}

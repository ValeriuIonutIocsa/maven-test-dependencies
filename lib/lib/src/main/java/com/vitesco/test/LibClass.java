package com.vitesco.test;

import org.apache.commons.lang3.StringUtils;

public class LibClass {

	public static final String MESSAGE = "message";

	public static boolean libMethod(
            final String str,
            final String otherStr) {
		return StringUtils.startsWithIgnoreCase(str, otherStr);
	}
}

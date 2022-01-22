package com.vitesco.test;

public class AppStart {

	private AppStart() {
	}

	public static void main(
			final String[] args) {

		System.out.println("1111 " + LibClass.MESSAGE);
		System.out.println("2222 " + LibClass.libMethod("Abcdef", "ABC"));
	}
}

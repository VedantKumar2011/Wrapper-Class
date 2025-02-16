package com.wrapper.methods;

public class TestWrapperMethods {

	public static void main(String[] args) {

		// valueOf() Converts a primitive or a string into a wrapper class object.

		System.out.println("============valueOf() begins================");

		Integer strObject = Integer.valueOf("123"); // String to Wrapper
		Integer intObject = Integer.valueOf(12); // primitive to wrapper
		Double doubleObject = Double.valueOf(45.6d); // primitive to wrapper
		Double doubleStrObject = Double.valueOf("60.68d"); //// String to Wrapper

		System.out.println("String to Integer: " + strObject);
		System.out.println("int to Integer: " + intObject);
		System.out.println("double to Double: " + doubleObject);
		System.out.println("String to Double: " + doubleStrObject);

		System.out.println("============valueOf() ends=================");

		// parseXxx() Converts a string into a primitive data type.

		System.out.println("==============parseXxx() begins===============");

		int num1 = Integer.parseInt("220");
		boolean parseBoolean = Boolean.parseBoolean("True");
		float floatNum = Float.parseFloat("12.20");
		long longNum = Long.parseLong("987654321");

		System.out.println("String to int: " + num1);
		System.out.println("String to boolean: " + parseBoolean);
		System.out.println("String to float: " + floatNum);
		System.out.println("String to long: " + longNum);

	}
}

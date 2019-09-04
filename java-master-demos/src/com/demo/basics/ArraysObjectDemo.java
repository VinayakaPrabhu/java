package com.demo.basics;

import java.util.Arrays;

public class ArraysObjectDemo {
	public static void referenceArrays() {
		// String []strArrString = {"str1","str2"};

		Test[] tests1 = { new Test(), new Test(), new Test() };
		
		tests1[0].messageString = "Welcome";
		System.out.println(tests1.length);
		// Declare an array
		Test tests[];
		// Set the dimension
		tests = new Test[3];
		// Create the instance
		tests[0] = new Test();
		tests[0].messageString = "Hello";
		tests[2] = new Test();
		tests[2].messageString = "Welcome";
		//enhanced for loop
		for (Test objTest : tests) {
			System.out.println(objTest);
		}
	}

	public static void main(String[] args) {
		//referenceArrays();
stringArray();
	}

	private static void stringArray() {
		// String [] fruitString= {"Apple","Pappaya","Mango"};
		String[] fruitString = new String[3];
		fruitString[0] = "Ap";
		fruitString[0] = "Pa";
		fruitString[0] = "Ma";
		// System.out.println(fruitString);
		// System.out.println(Arrays.toString(fruitString));

		for (int ctr = 0; ctr < fruitString.length; ctr++)
			System.out.println(fruitString[ctr]);

		for (String fruit : fruitString) {
			System.out.println(fruit);
		}
	}
}

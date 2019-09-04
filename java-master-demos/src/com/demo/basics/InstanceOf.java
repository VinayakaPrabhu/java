package com.demo.basics;

public class InstanceOf {
	public static void main(String[] args) {
		Test obj = new Test();
		Product obj1 = new Product();
		Object obj2 = new Object();
		if (obj instanceof Test) {
			System.out.println("Object of Test");
		}
		if (obj1 instanceof Object) {
			System.out
					.println("Object of Product");
		} else {
			System.err.println(
					"Not an Object of Product");
		}
	}
}

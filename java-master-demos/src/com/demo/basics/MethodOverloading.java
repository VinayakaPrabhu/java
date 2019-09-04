package com.demo.basics;

import java.util.Scanner;

public class MethodOverloading {
//Method overloading
//multiple methods with same name
//different signature
	// no of parameters
	// type of parameters
	// order of parameters
	public void add(int a) {
		System.out.println(a + a);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(float a, float b) {
		System.out.println("f: " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, float b) {
		System.out.println("i,f");
	}

	public void add(float a, int b) {
		System.out.println("f,i");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(2);
		obj.add(2, 3);
		obj.add(2, 3, 4);
		obj.add(2.3f, 3.4f);
		obj.add(2f, 1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter message");
		String messageString = scanner.nextLine();
		float floatValue = scanner.nextFloat();
		System.out.println(floatValue*floatValue);
		System.out.println(messageString);

		obj.add(3, 4f);
	}
}

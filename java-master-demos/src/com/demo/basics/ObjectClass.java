package com.demo.basics;

import java.lang.*;

public class ObjectClass extends Object {
	public static void main(String[] args) {
		int i; //allocates memory
		ObjectClass objectClass1; //not allocate memory space
		objectClass1 = new ObjectClass();
		ObjectClass objectClass = new ObjectClass();
		System.out
				.println(objectClass.toString());

		Player player = new Player();
		System.out.println(player);
		
		new ObjectClass().test();
		
		String eatable = "idli";
		String eatable1 = new String("chatni");
	}
	
	public void test() {
		int j = 100;
		System.out.println(j);
	}

	/*
	 * public String toString() {
	 * 
	 * return "My object"; }
	 */
}


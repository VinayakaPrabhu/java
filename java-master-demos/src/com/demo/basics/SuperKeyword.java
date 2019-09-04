package com.demo.basics;

public class SuperKeyword {
static Derived derived = new Derived();
public static void main(String[] args) {
	System.err.println(derived.messageString);
	derived.display();
}
}

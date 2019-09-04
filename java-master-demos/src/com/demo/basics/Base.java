package com.demo.basics;

public class Base {
	public Base() {
		System.out.println("Base");
	}
	public Base(String message) {
		messageString = message;
	}
public String messageString = "hi";
public void display() {
	System.out.println(messageString);
}
}

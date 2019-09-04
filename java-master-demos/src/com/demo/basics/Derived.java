package com.demo.basics;

public class Derived extends Base{
	public Derived() {
		super("FromDerived");
		System.out.println("Derived");
	}
	public String messageString = "hii";
	public void display() {
		System.out.println(super.messageString);
		super.display();
		System.out.println(messageString);
	}
}

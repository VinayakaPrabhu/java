package com.queue;

public class Customer {
	public static final Customer JACK = new Customer("Jack");
	public static final Customer JILL = new Customer("Jill");
	public static final Customer MARY = new Customer("Mary");
	public static final Customer BELL = new Customer("Bell");

	private final String name;

	public Customer(final String name) {
		this.name = name;
	}

	public void reply(final String message) {
		System.out.printf("%s: %s\n", name, message);
	}
}

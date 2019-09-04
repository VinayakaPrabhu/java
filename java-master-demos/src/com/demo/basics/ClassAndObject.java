//package to which the following class belongs.
package com.demo.basics;

public class ClassAndObject {
	// declaring member variables

	int productId;
	String productName;
	float price;
	String description;

	public void initAndPrint() {
		// initialize the variables
		productId = 1;
		productName = "Laptop";
		price = 7000.50f;
		description = "SSD State of the Art Laptop";

		// print the variables
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(description);
	}

	public static void main(String[] args) {
		//Declare
//		int productId;
//		String productName;
//		float price;
//		String description;

		//Initialize
//		 productId = 1; 
//		 productName = "Laptop"; 
//		 price = 7000.50f; 
//		description = "SSD State of the Art Laptop";

//		System.out.println(productId);
//		System.out.println(productName);
//		System.out.println(price);
//		System.out.println(description);
		//Create an object
		ClassAndObject arrayDemo = null;
		//Create an instance
		arrayDemo = new ClassAndObject();
		arrayDemo.initAndPrint();
	}
}

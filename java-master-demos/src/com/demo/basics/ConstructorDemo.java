package com.demo.basics;


public class ConstructorDemo {
	// declaring member variables

	int productId; //0
	String productName; //null
	float price; //0.0
	String description; //null

	//Constructor
	//Called when instance is created.
	//Initialize the variables
	//Same name as class
	//No return type
	//default constructor
	
	public ConstructorDemo() {
		//Initialize
		 productId = 1; 
		 productName = "DummyProduct"; 
		 price = 50.50f; 
		 description = "Dummy Product";
	}
	//Parameterized constructor takes parameters.
	public ConstructorDemo(int pProductId, String pProductName) {
		//Initialize
		 productId =pProductId; 
		 productName =pProductName; 
		 price = 5.5f;
	}
	public void print() {

		// print the variables
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(description);
	}
	public void print(float tax) {

		// print the variables
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price + tax);
		System.out.println(description);
	}

	public static void main(String[] args) {
		//Create an object
		//The default constructor is called
		ConstructorDemo arrayDemo = new ConstructorDemo();
		arrayDemo.print();
		ConstructorDemo arrayDemo1= new ConstructorDemo(2, "Mouse");
		arrayDemo1.print(5.6f);
	}
}

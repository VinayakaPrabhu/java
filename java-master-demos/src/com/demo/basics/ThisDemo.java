package com.demo.basics;

public class ThisDemo {
	
public static void main(String[] args) {
	Product product = new Product("Barbie");
	System.err.println(product.productNameString);
	Product product1 = new Product("Derby");
	System.err.println(product1.productNameString);
}
}


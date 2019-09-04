package com.demo.basics;

public class VariableScopes {
	int i =400;
public void method() {
	int i = 200;
	if(true) {
		int i1  = 100;
		System.out.println(i1);
	}
	System.out.println(i);
	long bigValue = 99L;
	int squashed = (int) (((bigValue)));
}
}

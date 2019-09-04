package com.demo.basics;

class Test2 {
	public String messageString;

}

public class PassByValue {
	static int i = 100;

	public static void main(String[] args) {
//		System.out.println(i);
//		m(i);
//		System.out.println(i);
		
		Test2 test2 = new Test2(); //0x1
		test2.messageString = "hi";
		m1(test2); //0x1
		System.err.println(test2.messageString);
	}

	public static void m(int x) {
		x = 200;
		System.out.println(x);
	}
	public static void m1(Test2 x) { //0x1
		x = new Test2(); //0x2
		x.messageString = "welcome";
		System.out.println(x.messageString);
	}
}

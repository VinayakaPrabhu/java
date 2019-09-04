package com.demo.basics;
class Test1 implements Cloneable{
	public String messageString;
	
	@Override
	protected Object clone()
			throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneObject {
public static void main(String[] args) {
	Test1 test1 = new Test1();
	test1.messageString = "welcome";
	Test1 test12 = null;
	try {
		test12 = (Test1)test1.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

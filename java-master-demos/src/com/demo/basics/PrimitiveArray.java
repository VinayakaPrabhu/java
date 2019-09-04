package com.demo.basics;

import java.util.Scanner;

public class PrimitiveArray {
	public static void main(String[] args) {
		//intArray();
		//charArray();
		//booleanArray();
		//floatArray();
		byteArray();
	}
    public static void intArray() {
    	int [] marks1 = {1,2,3};
		for(int i : marks1) {
			System.out.println(i);
		}
		//declaring an array
		int [] marks;
		//allocating memory for the array
		//marks = {2,3,4};
		marks = new int[3];
		marks[0] = 100;
		marks[1] = 99;
		
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<marks.length; i++) {
			marks[i] = scanner.nextInt();
		}
		for(int mark : marks) {
			System.err.println(mark);
		}
		System.out.println(marks[0]);
    }
    public static void charArray() {
    	char [] chars = {'1','2','3','a','b'};
		for(char i : chars) {
			System.out.println(i);
		}
    }
    public static void booleanArray() {
    	boolean [] choices = {true, false,false};
		for(boolean i : choices) {
			System.out.println(i);
		}
    }
    public static void floatArray() {
    	float [] floats = {1.2f, 2.2f, -3.30f};
		for(float i : floats) {
			System.out.println(i);
		}
    }
    public static void byteArray() {
    	byte [] bytes = {127, -128};
		for(byte i : bytes) {
			System.out.println(i);
		}
    }
}

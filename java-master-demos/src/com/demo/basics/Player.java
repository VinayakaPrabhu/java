package com.demo.basics;

class Player {
	String firstNameString = "Rambo";
	String lastNameString = "John";
	int played = 500;

	//Overriding base class method.
	/* @Override */
	public String toString() {
		return "Player Details : \n" + firstNameString + "\n " + lastNameString +  "\n " + played;
	}

}
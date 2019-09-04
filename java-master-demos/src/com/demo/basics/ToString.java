package com.demo.basics;

public class ToString {
public static void main(String[] args) {
//	Test50 object = new Test50();
//	System.out.println(object);
	Player player = new Player();
	System.out.println(player);
	//System.out.println(player.firstNameString + " " +player.lastNameString +  " " + player.played);
}
}
class Test50{
	public String messageString = "welcome";
	@Override
	public String toString() {
		//return "This is the Test50 class instance";
		return messageString;
	}

}

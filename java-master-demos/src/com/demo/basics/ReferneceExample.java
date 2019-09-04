package com.demo.basics;

public class ReferneceExample {
	public static void main(String[] args) {
		Projector projector = new Projector("NEC");
//		Projector projector1 = projector;
		Projector projector1 = new Projector("NEC1");
		//projector.projectorName="NEC1";
		System.out.println(projector.projectorName);
		System.out.println(projector1.projectorName);
		
		System.out.println(new Projector("TestProj").projectorName);
	}
	
}
class Projector{
	String projectorName = "NEC";
	public Projector(String projector) {
		this.projectorName = projector;
		//System.out.println(projector);
	}
}
class Team{
	String nameString;
}
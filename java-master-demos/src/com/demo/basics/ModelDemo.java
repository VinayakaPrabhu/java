package com.demo.basics;

public class ModelDemo {
	public static void main(String[] args) {
		Employee rambo = new Employee();
		rambo.setAge(30);
		System.err.println(rambo.getAge());
	}

}


class Employee{
	private String name;
	private int age;
	
	//setter
	public void setAge(int age) {
		if(age >17 && age < 58)
		this.age = age;
		else {
			System.out.println("We know you are great and work well, \n but sorry we cannot have you in our company!");
		}
	}
	//getter
	public int getAge() {
		return this.age;
	}
}
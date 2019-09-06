package collections;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedObjects {
	public static void main(String [] args) {
		
		// Creating Customer objects.
		Customer customer1 = new Customer("Jay", 1000, 2);
		System.out.println(customer1);
		System.out.println(customer1.toString());
		
		Customer customer3 = new Customer("Ricky", 5000, 1);
		Customer customer4 = new Customer("Tom", 3000, 6);
		Customer customer5 = new Customer("Mick", 6000, 4);
		//List  arr = new ArrayList();
		List<Customer> arr = new ArrayList<Customer>(); // ArrayList will contain a collection of Customer's
																// objects.

	

		String testString = "test string";
		// Storing objects in an ArrayList collection class.
		arr.add(customer1);
		arr.add(customer3);
		arr.add(customer4);
		arr.add(customer5);
		//arr.add(testString);
		
		System.out.println(arr);
       
		for (Customer c : arr)
			System.out.println(c);

	}
}

class Customer {
	String name;
	int balance;
	int id;

//Costructor 
	Customer(String s, int i, int j) {
		name = s;
		balance = i;
		id = j;
	}

//toString() method is overridden 
	public String toString() {
		return  name + " " + balance + " " + id;
	}

}
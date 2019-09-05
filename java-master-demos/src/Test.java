
public class Test {
	static String Test = "String";

	//Constructor
	//Constructors are functions which have the same name of the class.
	//Invoked automatically during instance creation.
	//Cannot be explicitly called.
	//Default constructor does not contain parameters.
	
	public Test() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		int i = 10;
		int j = 100;
		int k = 20;
		System.out.println(i + j * k);
		
		Test test = new Test();
		//test.Test();
	}
}

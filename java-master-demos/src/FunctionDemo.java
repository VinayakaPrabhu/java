public class FunctionDemo {
	public static void main(String[] args) {
		// create an object
		FunctionDemo object = new FunctionDemo();
		// call or invoke the function
		display();
		object.display("Red Rose");
		object.displayMessage("Discipline is a virtue!");
		// main is calling function
		object.sum(100, 200);
		int resultVar = object.mul(500, 700);
		System.out.println(resultVar);
	}

	// defining the function
	static public void display() {
		System.out.println("God is everywhere!");
	}

	public void sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	public int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	// argument or parameter
	public void display(String message) {
		System.out.println(message);
	}

	public void displayMessage(String message1) {
		System.out.println(message1);
	}

}

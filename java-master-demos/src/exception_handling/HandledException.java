package exception_handling;

public class HandledException {
 public static void main(String[] args) {
	int i = 100;
	int result = 0;
	System.out.println("Dividing by zero");
	try {
		result = i/0;
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	System.out.println("Does not execute");
	System.out.println(result);
}
}

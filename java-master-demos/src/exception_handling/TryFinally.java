package exception_handling;

public class TryFinally {
 public static void main(String[] args) {
	int i = 100;
	int result = 0;
	System.out.println("Dividing by zero");
	try {
		result = i/10;
		result = i/0;
	}
	finally {
		System.out.println("finally executed");
		i = 0;
		//result = 0;
	}

	System.out.println("Marker");
	System.out.println(result);
}
}

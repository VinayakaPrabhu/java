package exception_handling;

public class UnhandledException {
 public static void main(String[] args) {
	int i = 100;
	System.out.println("Dividing by zero");
	int result = i/0;
	System.out.println("Does not execute");
	System.out.println(result);
}
}

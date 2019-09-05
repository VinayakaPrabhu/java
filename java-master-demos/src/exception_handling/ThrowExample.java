package exception_handling;

public class ThrowExample {
	public static void main(String[] args) {
		ThrowExample throwsExample = new ThrowExample();
		throwsExample.method2();
	}

	public void method1() throws NullPointerException {
		System.out.println("method1 begin");
	NullPointerException object = new NullPointerException();
	throw object;
	//System.out.println("method1 end");
	}

	public void method2() {

		System.out.println("method2 begin");
		try {
			method1();
		} catch (NullPointerException e) {
			System.out.println("exception handled " + e.getMessage());
		}

		System.out.println("method2 end");
	}

}

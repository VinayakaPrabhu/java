package exception_handling;

class Test2 {
	int value = 10;
}

public class ThrowsExample {
	public static void main(String[] args) {
		ThrowsExample throwsExample = new ThrowsExample();
		throwsExample.method2();
	}

	public void method1() {
		Test2 test = null;
		System.out.println("method1 begin");
		// test = new Test1();
		System.out.println(test.value);
		System.out.println("method1 end");
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

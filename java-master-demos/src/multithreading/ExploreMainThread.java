package multithreading;

public class ExploreMainThread {
public static void main(String[] args) {
	Thread thread = Thread.currentThread();
	System.out.println(thread.getName());
	System.out.println("I am tired....going to sleep for 5 seconds");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Hi, i am there up and running....");
}
}

class Test{
	public void testMethod() {
		System.out.println("Test On Thursday!");
	}
}

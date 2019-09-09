package multithreading;

public class EvenThread extends Test implements Runnable{

public void run() {
	for(int i = 0; i<10; i+=2) {
		Thread thread = Thread.currentThread();
		thread.setName("Even");
		System.err.println(Thread.currentThread().getName() + " " + i);
	}
}
}

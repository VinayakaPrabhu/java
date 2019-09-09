package multithreading;

public class EvenOddThreadApp {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	//EvenThread implements runnable
	//does not have start()
	EvenThread evenThread = new EvenThread();
	//pass the EvenThread to constructor of Thread Class
	Thread thread = new Thread(evenThread);
	//use start() method of the thread class.
	thread.start();
	OddThread oddThread = new OddThread();
	oddThread.start();
	System.out.println("main thread ending!");
}
}

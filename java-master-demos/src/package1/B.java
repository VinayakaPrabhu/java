package package1;

public class B extends A{
	public static void main(String[] args) {
		A obj = new A();
		String testVal = obj.test;
		System.out.println(testVal);
		obj.disp();
	}
}

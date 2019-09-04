package package1;

public class A {
	 protected String test = "testing";

	 protected void disp() {
		System.out.println("disp");
	}
	
	public static void main(String[] args) {
		A obj = new A();
		String testVal = obj.test;
		System.out.println(testVal);
		obj.disp();
	}
}

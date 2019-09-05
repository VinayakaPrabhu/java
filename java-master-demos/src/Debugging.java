import javax.xml.ws.Dispatch;

public class Debugging {

	public static void main(String[] args) {
		int i = 100;
		int j = 500;
		int result = i/j;	
		disp();
		new Object();
		String string = new String("welcome");
		System.out.println(result);
	}
	public static void disp() {
		String arr[] = {"one", "two","three"};
		arr[2] = "five";
		System.out.println(arr);
	}
}

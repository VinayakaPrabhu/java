
public class IfElse {
public static void main(String[] args) {
	//keywords cannot be variables
	//boolean break = false;
	
	boolean classTime = true;
	if(classTime == true) {
		System.out.println("projector on");
	}
	
	//classTime = false;
	if(classTime != true) {
		System.out.println("projector off");
	}
	
	if(classTime == true) {
		System.out.println("projector on");
	}
	else {
		System.out.println("projector off");
	}
}
}

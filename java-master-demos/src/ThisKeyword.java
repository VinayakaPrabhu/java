
public class ThisKeyword {
public static void main(String[] args) {
	Mobile mobile = new Mobile("test", 123);
	mobile.display();
}
}
class Mobile {
	//instance variables
	String name;
	float price;
 
	//method scope
	public Mobile(String name, float price) {
//		this.name=name;
//		this.price=price;
		name=name;
		price=price;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(price);
	}
}
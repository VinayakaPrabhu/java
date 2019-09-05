
public class PassingAndReturningObjects {
public static void main(String[] args) {
	Product product1 = new Product();
	product1.price = 100;
	Product product2 = new Product();
	product2.price = 200;
	
	PassingAndReturningObjects object = new PassingAndReturningObjects();
	//object.addProduct(product1, product2);
	Product product4 = object.addProduct(product1, product2);
	System.out.println(product4.price);
}

//public void addProduct(Product product1, Product product2) {
//	int total = product1.price + product2.price;
//	System.out.println(total);
//}

public Product addProduct(Product product1, Product product2) {
	Product product3 = new Product();
	product3.price = product1.price + product2.price;
	return product3;
}
}

class Product{
	public int price;
}
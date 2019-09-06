package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsGenerics {
public static void main(String[] args) {
	method1();
}
public static void method1() {
	List<String> list = new ArrayList<String>();
	list.add("Volvo");
	list.add("Mercedez");
	
	Iterator<String> iterator = list.iterator();

	while(iterator.hasNext()){
	  String aString = iterator.next();
	  System.out.println(aString);
	}

	for(String aString : list) {
	    System.out.println(aString);
	}
}
}

package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsMasterSet {
	public static void main(String[] args) {
		//set1();
		//set2();
		//set3();
		//set4();
		set5();
	}

	public static void set1() {
		Set setA = new HashSet();

		String element = "element 1";

		setA.add(element);

		System.out.println(setA.contains(element));
		System.out.println(setA);
	}

	public static void set2() {
		Set setA = new HashSet();

		setA.add("element 1");
		setA.add("element 2");
		setA.add("element 3");
		
		//Using iterator interface
		Iterator iterator = setA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element);
		}
		
		//enhanced for loop
		for(Object object : setA) {
		    String element = (String) object;
		    System.out.println(element);
		}
		setA.clear();
	}
	public static void set3() {
		Set set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");

		Set set2 = new HashSet();
		set2.add("12");

		set2.addAll(set);
		System.out.println(set2);
		
	}
	public static void set4() {
		Set set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");

		Set set2 = new HashSet();
		set2.add("three");
		set2.add("four");

		set.retainAll(set2);
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.err.println(set.contains("three"));
	}
	public static void set5() {
		Set set = new HashSet();
		set.add("123");
		set.add("456");

		List list = new ArrayList();
		list.addAll(set);
		System.out.println(list);
	}
}

package collections;

import java.util.ArrayList;

public class CollectionWithWrapper {
public static void main(String[] args) {
	ArrayList arrayList = new ArrayList();
	// number 10
	int i = 10; //primitive type
	Integer i1 = new Integer(i); //boxing 
	Object object = i1; //upcasted 
	//System.out.println(i);
	//System.out.println(i1);
	arrayList.add(i1);
	//arrayList.add(i1);
	Object object2 = arrayList.get(0);
	Integer i3 = (Integer)object2; //Downcast
	int i4 = i3.intValue(); //unboxing
	
	System.out.println(arrayList);
}
}

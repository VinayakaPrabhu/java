package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}

	public static void m1() {
		Map mapA = new HashMap();

		mapA.put("e01", "Samy");
		mapA.put("key2", "element 2");
		mapA.put("key3", "element 3");
		System.err.println(mapA);

		System.err.println(mapA.get("key1"));
		System.err.println(mapA.get("key2"));
		System.err.println(mapA.containsKey("key2"));
	}

public static void m2() {
	Map mapA = new HashMap();

	mapA.put("key1", "element 1");
	mapA.put("key2", "element 2");
	mapA.put("key3", "element 3");
	Iterator iterator = mapA.keySet().iterator();
	
	while(iterator.hasNext()){
	  Object key   = iterator.next();
	  Object value = mapA.get(key);
	  System.out.println(value);
	}
	
	Iterator iterator1 = mapA.values().iterator();

	while(iterator1.hasNext()) {
	    Object nextValue = iterator1.next();
	    System.out.println(nextValue);
	}
	
	for(Object value : mapA.values()){
	    System.out.println(value);
	}
	for(Object value : mapA.keySet()){
	    System.out.println(value);
	}
	for(Object value : mapA.entrySet()){
	    System.out.println(value);
	}
}
public static void m3() {
	Map mapA = new HashMap();

	mapA.put("key1", "element 1");
	mapA.put("key2", "element 2");
	mapA.put("key3", "element 3");
	Set entries = mapA.entrySet();
	Iterator iterator = entries.iterator();
	while(iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    Object key = entry.getKey();
	    Object value = entry.getValue();
	    System.out.println("Entry : " + key + " : " + value);
	}
	
	for(Object entryObj : mapA.entrySet()){
	    Map.Entry entry = (Map.Entry) entryObj;
	    Object key = entry.getKey();
	    Object value = entry.getValue();
	    System.out.println("Entry : " + key + " : " + value);
	}
}
}

package ch07;

import ch07.array.*;

public class tester {

	public static void main(String[] args) {
		ArrayRefSortedStringList list1 = new ArrayRefSortedStringList(10);
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		System.out.println(list1.toString());
		//list1.info();
		list1.remove("a");
		System.out.println(list1.toString());
//		list1.info();
		
		
		//System.out.println(list1.get("3"));

		// Below here is done.
		
//		System.out.println("contains \"b\" : " + list1.contains("b"));
		
//		list1.reset();
//		System.out.println(list1.getNext());
//		System.out.println(list1.getNext());
//		System.out.println(list1.getNext());
//		System.out.println(list1.getNext());
//		System.out.println(list1.getNext());
//		System.out.println(list1.isFull());
		
		System.out.println(list1.size());
	}

}

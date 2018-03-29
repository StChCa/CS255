package ch07;

import ch07.array.*;

public class tester {

	public static void main(String[] args) {
		ArrayRefSortedStringList list1 = new ArrayRefSortedStringList(5);
		
		list1.add("b");
		list1.add("c");
		list1.add("a");
		list1.add("g");
		
		list1.reset();
		System.out.println(list1.getNext());
		System.out.println(list1.getNext());
		System.out.println(list1.getNext());
		System.out.println(list1.getNext());
	}

}

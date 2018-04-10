package ch07;

import ch07.array.*;

public class tester {

	public static void main(String[] args) {
		ArrayRefSortedStringList list1 = new ArrayRefSortedStringList(10);
		
		System.out.println("Size: " + list1.size());
		System.out.println("isFull? : " + list1.isFull());
		list1.add("g");
		list1.add("c");
		list1.add("b");
		list1.add("a");
		System.out.println("Size: " + list1.size());
		
		System.out.println("Contains (g): " + list1.contains("g"));
		System.out.println(list1.toString());
		
		list1.reset();
		System.out.println(list1.getNext());
		System.out.println(list1.getNext());
		System.out.println(list1.getNext());
		System.out.println(list1.getNext());
		
		System.out.println(list1.toString());
		
		list1.remove("c");
		System.out.println(list1.toString());
		list1.remove("a");
		System.out.println(list1.toString());
		list1.remove("b");
		System.out.println(list1.toString());
		list1.remove("g");
		
		for(int x = 0 ; x <10; x++) {
			list1.add("f");
		}
		System.out.println("Size: " + list1.size());
		System.out.println("is Full: " + list1.isFull());
		
	}

}

package ch06;

import ch06.lists.*;

public class ListTester {

	public static void main(String[] args) {
		
		/*
		 * Uncomment each line below to test  each type.
		 */
		//ArrayUnsortedList<String> test = new ArrayUnsortedList<String>();
		//ArraySortedList<String> test = new ArraySortedList<String>();
		//RefUnsortedList<String> test = new RefUnsortedList<String>();
		RefSortedList<String> test = new RefSortedList<String>();
		//ArrayIndexedList<String> test = new ArrayIndexedList<String>();
		
		test.add("b");
		test.add("a");
		test.add("b");
		test.add("c");
		test.add("d");
		test.add("e");
		test.add("b");
		test.add("b");
		test.add("a");
		//comment
		System.out.println("I have this many " + test.howMany("b"));
		System.out.println(test.toString());
		System.out.println("Removed this many: " + test.removeAll("b"));
		System.out.println(test.toString());
		

	}

}

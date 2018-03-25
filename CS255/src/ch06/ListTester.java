package ch06;

import ch06.lists.ArraySortedList;
import ch06.lists.ArrayUnsortedList;

public class ListTester {

	public static void main(String[] args) {
		
		//ArrayUnsortedList<String> test = new ArrayUnsortedList<String>();
		ArraySortedList<String> test = new ArraySortedList<String>();
		
		test.add("two");
		test.add("one");
		test.add("two");
		test.add("three");
		test.add("four");
		test.add("five");
		test.add("two");
		test.add("two");
		//comment
		System.out.println("This many " + test.howMany("two"));
		System.out.println(test.toString());
		test.removeAll("two");
		System.out.println(test.toString());

	}

}

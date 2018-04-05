package ch07;

import ch07.array.DRefUnsortedList;

public class DListTester {

	public static void main(String[] args) {
		DRefUnsortedList<String> dlist = new DRefUnsortedList<String>();
		
		System.out.println(dlist.size());
		dlist.add("l");
		System.out.println(dlist.size());
		dlist.add("w");
		System.out.println(dlist.size());
		
		System.out.println(dlist.remove("l"));
		
	}

}

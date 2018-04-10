package ch07;

import ch07.array.DCRefHeaderSortedList;

public class circListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DCRefHeaderSortedList<String> list = new DCRefHeaderSortedList<String>("///");
		
		list.add("a");
		
		System.out.println(list.toString());
	}

}

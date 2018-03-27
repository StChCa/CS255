package ch06;

import ch06.lists.*;

public class ListAddTester {

	public static void main(String[] args) {
		/*
		 * Steve Cardone ch06 Lab02 
		 * A:
		 * 		THIS IS THE PSUDOCOE FOR THE NEW ADD METHOD IN ArraySortedList
		 * 
		 * I need to add an element.
		 * 
		 * First, check to see if I need to enlarge my list. If so then do, if not then don't.
		 * 
		 * ***for each element "e" in my list (Starting at the back aka list[numElements])
		 * 		if the element i want to add belongs AFTER e
		 * 			add the element to the right of e 
		 * 			increase numElements
		 * 			and break the loop
		 * 		else move e one spot to the right then loop back to *** 
		 * 			
		 *  do that loop until we find where it belongs, or hit the front of the list. in which case it put it to the front of the list.
		 * 
		 */
		
		ArraySortedList<Integer> l1 = new ArraySortedList<Integer>();
		
//		for(int x = 0; x<109;x++)
//			l1.add(2);
		
		l1.addV2(1);
		System.out.println(l1.toString());
		l1.addV2(2);
		l1.addV2(2);
		l1.addV2(3);
		l1.addV2(1);
		
		System.out.println(l1.toString());
	}

}

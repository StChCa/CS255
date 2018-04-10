package ch07;
import ch07.array.DRefUnsortedList;

public class DListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DRefUnsortedList<String> dlist = new DRefUnsortedList<String>();
		System.out.println(dlist.size());
		dlist.add("j");
		System.out.println(dlist.size());
		dlist.add("o");
		System.out.println(dlist.size());
		dlist.add("k");
		dlist.add("p");
		dlist.add("d");
		
		dlist.remove("e");
		
		System.out.println(dlist);
		//System.out.println(dlist.revString());
		

		System.out.println();
		System.out.println("EndList testing: ");
		// below is testing the endList attribute

		
		System.out.println(dlist.toString());
		System.out.println(dlist.firstAndLastNodes());
		
		System.out.println("removed first value: ");
		dlist.remove("d");
		System.out.println(dlist.toString());
		System.out.println(dlist.firstAndLastNodes());
		
		System.out.println("removed last value: ");
		dlist.remove("j");
		System.out.println(dlist.toString());
		System.out.println(dlist.firstAndLastNodes());
	}

}

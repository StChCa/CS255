/**
 *  
*/
package ch01;
/*
 * @author svc-student * 
*/public class PersonTester {
	/** 
	 * @param args 
	*/public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person james = new Person("James", "Bond");
		Person james = new Person();
		
		System.out.println(james.getFirstName() + " " + james.getLastName());
		
		// test setters
		
		james.setFirstName("James");
		james.setLastName("Bond");
		System.out.println(james.getFirstName() + " " + james.getLastName());
		
		Person james2 = new Person("James", "Cameron");
		
		System.out.println(james == james2);
		System.out.println(james.equals(james2));
		System.out.println(james.compareTo(james2));
		
		Person susan = new Person("Susan", "Anthony");
		System.out.println(susan.getFirstName() + " " + susan.getLastName());
		
	}
	
	
}

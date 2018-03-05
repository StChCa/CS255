/**
* @ author Steve Cardone
*/
package ch01;

public class Person implements Comparable<Object>{
	private String firstName;
	private String lastName;
	
	public Person() {
		//create basic john doe person
		this.firstName = "John";
		this.lastName = "Doe";
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int compareTo(Object aPerson) {
		// can also just set the if(THIS) as return return getFirstName().compareTo(......))
		Person newPerson = (Person)aPerson;
		
		if (getFirstName().compareTo(newPerson.getFirstName()) == 0) {
			return 0;
		}
		
		return 1;
	}

}
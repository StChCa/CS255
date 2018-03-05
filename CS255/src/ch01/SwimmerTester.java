package ch01;

/**
 * @author Steve Cardone  css 255 - 001 Lab1
 * 
 * This class Tests the Swimmer class' functionality.
 *
 */

public class SwimmerTester {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// Create a swimmer named bob and test that the swimmer was created by printing
//		//the to string method inhereted from the Athlete class.
//		Swimmer bob = new Swimmer();
//		System.out.println(bob.toString());
//		
//		//Test our overloaded constructor that adds name and assigns swimming to the sport value.
//		//then print to make sure it worked.
//		Swimmer joe = new Swimmer("Joe", "Newman");
//		System.out.println(joe.toString());
//		
//		// Test setters
//		bob.setLastName("Ross");
//		bob.setFirstName("Bob");
//		bob.setBestTime(1500);
//		bob.setHoursOfTraining(100);
//		bob.setStroke("Freestyle");
//		
//		// Test Getters
//		System.out.println("Name: " + bob.getFirstName() + " " + bob.getLastName());
//		System.out.println("Best time / Hours of training / Stroke: " + bob.getBestTime()
//		 + " / " + bob.getHoursOfTraining() + " / " + bob.getStroke());
//		
//		// Test my 2 new methods.
//		System.out.println("Swimmer is off world record by: " + bob.compareToWorldRecord());
//		System.out.println("Swimmer's fastest speed is : " + bob.calculateSpeed() + "m/s");
		
		// ********* Uncomment code above to test basics of the Swimmer class. below code
		// tests the implimenttion of the comparable interface. (Lab2) ****************
		
		//first, I create 5 swimmers that will be compared later
		Swimmer alan = new Swimmer("Alan","Martins","Freestyle",107.3);
		Swimmer ben = new Swimmer("Ben","Stiller","Backstroke",95.9);
		Swimmer charlie = new Swimmer("Charlie","Bowman","Butterfly",95.9);
		Swimmer derick = new Swimmer("Derick","Willis","Breaststroke",84.4);
		Swimmer eddie = new Swimmer("Eddie","VanHalen","Freestyle",77.3);
		
		Swimmer[] mySwimmers = new Swimmer[5];
		//create array of swimmers and populate with swimmers above.
		mySwimmers[0] = alan;
		mySwimmers[1] = ben;
		mySwimmers[2] = charlie;
		mySwimmers[3] = derick;
		mySwimmers[4] = eddie;
		
		// print unsorted array  to console  * Notice I override the toString method
		// to make it easier for myself
		
		printArray(mySwimmers);		
		
		// sort array then print sorted array
		java.util.Arrays.sort(mySwimmers);

		System.out.println(); // empty line for readability
		printArray(mySwimmers);
		
		// Swimmer class compareTo method is implemented so that the sort function puts the
		// smallest number first because that indicates the fastest time.

		
	}
	
	public static void printArray(Swimmer[] swimmers) {
		for (Swimmer selected : swimmers) {
			
			System.out.println(selected.toString());
		}
	}

}

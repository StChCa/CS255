/**
 * 
 */
package ch01;

/**
 * @author Steve Cardone
 *
 */
public class RunnerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runner usain = new Runner("Usain", "Bolt");
		System.out.println(usain.toString());
		
		Runner ben = new Runner("Ben", "Carpenter");
		ben.setMilesRaced(10);
		System.out.println(ben.compareTo(usain));
	}

}

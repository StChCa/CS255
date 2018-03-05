/**
 * 
 */
package ch01;

/**
 * @author Steve Cardone  css 255 - 001 Lab1
 * 
 * This class outlines a swimmer and includes stroke the swimmer uses and best time.
 * This class implements the Comparable interface with compareTo()
 *
 */
public class Swimmer extends Athlete {
	
	private String stroke;
	// Stroke is the way a swimmer swims. there are 5 options... Freestyle, backstroke,
	// butterfly and breaststroke.
	
	private double bestTime;
	// This would be their best time in a race.
	
	public Swimmer(String firstName, String lastName) {
		super(firstName, lastName, "Swimming");
	}
	
	public Swimmer(String firstName, String lastName, String stroke, double bestTime) {
		super(firstName, lastName, "Swimming");
		//this.firstName = firstName;
		//this.lastName = lastName;
		this.stroke = stroke;
		this.bestTime = bestTime;
	}
	
	public Swimmer() {
		super();
	}

	/**
	 * @return the stroke
	 */
	public String getStroke() {
		return stroke;
	}

	/**
	 * @param set stroke
	 */
	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

	/**
	 * @return the bestTime
	 */
	public double getBestTime() {
		return bestTime;
	}

	/**
	 * @param set bestTime
	 */
	public void setBestTime(double bestTime) {
		this.bestTime = bestTime;
	}
	
	public double calculateSpeed() {
		// this method will calculate the speed of this swimmers fastest time and return speed
		double speed = this.getBestTime()/100;
		//speed will be meters / second
		return speed;
	}
	
	public double compareToWorldRecord() {
		// *************** THIS WAS FROM LAB 1 NOT LAB 2.*****************************
		// This method calculates how this swimmers time compares to the world record time.
		// ** this is not actually the world record time because it is different for each
		// stroke and distance of race and it changes. This is just a general calculation.
		double timeOffWR = 65 - this.getBestTime();
		//I made the world record time 65 seconds
		return timeOffWR;
	}
	
	@Override
	public int compareTo(Object aSwimmer) {
		// I have chosen to have the compareTo method compare the "bestTime" class variable
		// because it is a numeric value and we can sort our swimmers from slowest to fastest.
		
		//I cast my input object to type Swimmer
		Swimmer comparedSwimmer = (Swimmer) aSwimmer;
		
		if (this.getBestTime() == comparedSwimmer.getBestTime()) {
			return 0; // if best times are == then 0
		} else
			if(this.getBestTime() > comparedSwimmer.getBestTime()) {
				return 1;  // if this > compared then 0
			} else
				if (this.getBestTime() < comparedSwimmer.getBestTime()) {
					return -1; // if this < compared then 0
				}
		
		// failsafe
		return 0;
	}
	
	@Override
	public String toString() {
		
		return this.getFirstName() + " " + this.getLastName() + ": " + this.getStroke() 
		 + ": " + this.getBestTime();
		
	}
}

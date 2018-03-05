package ch01;

public class Athlete extends Person{
	
	private String sport;
	private double hoursOfTraining;
	
	public Athlete(String firstName, String lastName, String sport) {
		super(firstName, lastName);
		this.sport = sport;
		this.hoursOfTraining = 0.0;
	}
	
	public Athlete() {
		super();
	}

	/**
	 * @return the sport
	 */
	public String getSport() {
		return sport;
	}

	/**
	 * @param sport the sport to set
	 */
	public void setSport(String sport) {
		this.sport = sport;
	}

	/**
	 * @return the hoursOfTraining
	 */
	public double getHoursOfTraining() {
		return hoursOfTraining;
	}

	/**
	 * @param hoursOfTraining the hoursOfTraining to set
	 */
	public void setHoursOfTraining(double hoursOfTraining) {
		this.hoursOfTraining = hoursOfTraining;
	}
	
	public String toString() {
		return super.toString() + " " + getSport();
	}

}

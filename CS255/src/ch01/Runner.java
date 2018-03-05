package ch01;

public class Runner extends Athlete {
	private double milesRaced;
	private int numberOfRaces;
	
	public Runner(String firstName, String lastName, String sport) {
		super(firstName, lastName, sport);
		// TODO Auto-generated constructor stub
		
	}
	
	public Runner(String firstName, String lastName) {
		super(firstName, lastName, "Running");
	}
	
	/**
	 * @return the milesRaced
	 */
	public double getMilesRaced() {
		return milesRaced;
	}

	/**
	 * @param milesRaced the milesRaced to set
	 */
	public void setMilesRaced(double milesRaced) {
		this.milesRaced = milesRaced;
	}

	/**
	 * @return the numberOfRaces
	 */
	public int getNumberOfRaces() {
		return numberOfRaces;
	}

	/**
	 * @param numberOfRaces the numberOfRaces to set
	 */
	public void setNumberOfRaces(int numberOfRaces) {
		this.numberOfRaces = numberOfRaces;
	}

	@Override
	public int compareTo(Object aRunner) {
		Runner myRunner = (Runner) aRunner;
		
		if(this.getMilesRaced() == myRunner.getMilesRaced())
			return 0;
		else if(this.getMilesRaced() < myRunner.getMilesRaced())
			return -1;
		else if(getMilesRaced() > myRunner.getMilesRaced())
			return 1;
		
		return 1;
	}

}

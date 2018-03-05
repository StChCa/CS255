package ch01;

public class AthleteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Athlete mike = new Athlete("Michael","Phelps","Swimming");
		
		System.out.println("Athlete info: " + mike.toString());
		
		Athlete mike2 = new Athlete("Michael", "Jordan","Basketball");
		
		System.out.println(mike.compareTo(mike2));
		

	}

}

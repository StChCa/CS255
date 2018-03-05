package ch04;

// Steve Cardone

public class RecursiveMethodTester {
	
	static int[] testInts = new int[7];
	
	public static void main(String[] args) {
		
		testInts[0] = 8;
		testInts[1] = 3;
		testInts[2] = 6;
		testInts[3] = 88;
		testInts[4] = 43;
		testInts[5] = 12;
		testInts[6] = 10;
		
		System.out.println("exponent: " + raiseToPower(7,2));
		
		System.out.println("Max element is: " + maxElement(testInts, testInts.length-1));
	}

	public static int raiseToPower(int base, int exp){

		if (exp > 0)
			return base * raiseToPower(base, exp-1);
		
		return 1;
	}
	
	private static int maxElement(int[] collection, int index) {
		
		if (index >0) {
			return Math.max(collection[index] , maxElement(collection, index-1));
		}else {
			return collection[0];
		}
	}

}

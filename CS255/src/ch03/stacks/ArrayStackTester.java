package ch03.stacks;

/**
* 
* This Class tests the ArrayStack collection. It makes sure all methods function as expected
* and throw the appropriate errors when expected.
* @author Steve Cardone
*/

public class ArrayStackTester {

	public static void main(String[] args) {
		
		ArrayStack<String> myStack = new ArrayStack<String>();
		
		testAddtionalMethods(myStack);
		
//		System.out.println();
//		System.out.println("Below is a tester of the original ArrayStack methods.");
//		
//		testInitialMethods(myStack);
		
	}
	
	private static void testAddtionalMethods(ArrayStack<String> testStack) {
		
		testStack.push("first");
		testStack.push("Second");
		testStack.push("Third");
		testStack.push("Fourth");
		
		System.out.println("Full Top is: " + testStack.top());
		
		// inspecting # 2
		System.out.println("Inspected: " + testStack.inspector(2));
		
		// try to inspect an item that doesn't exist returns null
		System.out.println("Inspected: " + testStack.inspector(6));

		System.out.println("Current elements are: "+testStack.toString());
		
		testStack.popSome(1);
		testStack.popSome(3);
		// Line below will throw stackUnderFlowException because poping more elements than there are.
		//testStack.popSome(3);
		
		
		
		
	}

	public static void testInitialMethods(ArrayStack<String> testStack){
		
		// Test the initial methods supplied by book.
		System.out.println("Is empty? "+ testStack.isEmpty());
		System.out.println("Is Full? " + testStack.isFull());
		
		// uncomment the 2 rows below (1 at a time) to test pop/top empty stack StackUndeFlowException.
		//myStack.pop();
		//myStack.top();
		
		testStack.push("First");
		
		System.out.println("Is empty? "+ testStack.isEmpty());
		
		testStack.push("Second");
		
		System.out.println(testStack.top());
		
		do{
			testStack.push("doWhile");
		}
		while(testStack.topIndex < testStack.DEFCAP-1);
		
		System.out.println("Top index is " +testStack.topIndex);
		System.out.println("Is full? " + testStack.isFull());
		
		// uncomment this to test overflow test;
		//testStack.push("Overflow test.");
		
		testStack.pop();
		System.out.println("Is full? " + testStack.isFull());
		
	}

}

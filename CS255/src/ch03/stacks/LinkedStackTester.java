/**
 * 
 */
package ch03.stacks;

/**
 * @author Steve Cardone
 * 
 *	This Class is designed to test the LinkedStack class and its various methods.
 */
public class LinkedStackTester {

	public static void main(String[] args) {

		
		LinkedStack<String> myStack = new LinkedStack<String>();
		
		myStack.push("Test1");
		myStack.push("Test2");
		myStack.push("Test3");
		myStack.push("Test4");
		
		System.out.println(myStack.sizer());
		
		//testAddtionalMethods(myStack);

		// Uncomment below to test initial methods given by book.
//		System.out.println();
//		System.out.println("Below is a tester of the original ArrayStack methods.");
//		
//		testInitialMethods(myStack);
		
	}
	
	private static void testAddtionalMethods(LinkedStack<String> testStack) {
		
		testStack.push("first");
		testStack.push("Second");
		testStack.push("Third");
		testStack.push("Fourth");
		
		System.out.println("Full Top is: " + testStack.top());
		
		// inspecting # 2
		System.out.println("Inspected: " + testStack.inspector(2));
		
		// try to inspect an item that doesn't exist returns null
		System.out.println("Inspected: " + testStack.inspector(5));

		System.out.println("Current elements are: "+testStack.toString());
		
		testStack.popSome(1);
		testStack.popSome(3);
		// Line below will throw stackUnderFlowException because poping more elements than there are.
		//testStack.popSome(3);
		
		
		
		
	}

	public static void testInitialMethods(LinkedStack<String> testStack){
		
		// Test the initial methods supplied by book.
		System.out.println("Is empty? "+ testStack.isEmpty());
		
		
		// uncomment the 2 rows below (1 at a time) to test pop/top empty stack StackUndeFlowException.
		//myStack.pop();
		//myStack.top();
		
		testStack.push("First");
		
		System.out.println("Is empty? "+ testStack.isEmpty());
		
		testStack.push("Second");
		
		System.out.println(testStack.top());

	}

}

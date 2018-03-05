package ch05.queues;

public class ToStringTester {

	public static void main(String[] args) {
		
		// Uncomment each of the below to test each toString
		testArrayBndQueue();
		//testArrayUnbndQueue();
		//testLinkedUnbndQueue();
		//testCircLinkedUnbdQueue();

	}


	private static void testArrayBndQueue() {
		ArrayBndQueue<String> qTest = new ArrayBndQueue<String>();
		
		qTest.enqueue("One");
		qTest.enqueue("Two");
		qTest.enqueue("Three");
		qTest.enqueue("Four");
		
		System.out.println(qTest.toString());
	}

	private static void testArrayUnbndQueue() {
		ArrayUnbndQueue<String> qTest = new ArrayUnbndQueue<String>();
		
		qTest.enqueue("One");
		qTest.enqueue("Two");
		qTest.enqueue("Three");
		qTest.enqueue("Four");
		
		System.out.println(qTest.toString());
	}


	private static void testLinkedUnbndQueue() {
		LinkedUnbndQueue<String> qTest = new LinkedUnbndQueue<String>();
		
		qTest.enqueue("One");
		qTest.enqueue("Two");
		qTest.enqueue("Three");
		qTest.enqueue("Four");
		
		System.out.println(qTest.toString());
	}



	private static void testCircLinkedUnbdQueue() {
		CircLinkedUnbdQueue<String> qTest = new CircLinkedUnbdQueue<String>();
		
		qTest.enqueue("One");
		qTest.enqueue("Two");
		qTest.enqueue("Three");
		qTest.enqueue("Four");
		
		System.out.println(qTest.toString());
	}

}

package ch05.queues;
import ch05.queues.*;

public class QueueTester {
	
	public static void main(String[] args) {
		
		testMethod();
	}

	private static void testMethod() {
		
		
		CircLinkedUnbdQueue<String> q1 = new CircLinkedUnbdQueue<String>();
		
		System.out.println(q1.isEmpty());

		// Below should throw QueueUnderflowException
		//q1.dequeue();
		
		q1.enqueue("one");
		q1.enqueue("two");
		q1.enqueue("three");
		q1.enqueue("four");
		
		System.out.println("is empty? :" + q1.isEmpty());
		
		// THis is the rear of the queue
		System.out.println("Rear and front are : ");
		System.out.println(q1.rear.getInfo());
		
		// The link to the rear of the queue should be the front.
		System.out.println(q1.rear.getLink().getInfo());
		
		// Now deque to change front. now it should be 2
		q1.dequeue();
		
		q1.enqueue("Five");
		
		// now rear is 5 front should still be 2
		System.out.println("Rear and front are : ");
		System.out.println(q1.rear.getInfo());
		System.out.println(q1.rear.getLink().getInfo());
		
		//Deque until empty just to test
		
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		//Uncomment line below to test make que empty 
		//q1.dequeue();
		
	}

}

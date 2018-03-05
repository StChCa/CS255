package ch05.queues;
import ch05.queues.*;

public class QueueTester {

	public static void main(String[] args) {
		
		//LinkedUnbndQueue<String> q1 = new LinkedUnbndQueue<String>(); 
		
		//ArrayUnbndQueue<String> q1 = new ArrayUnbndQueue<String>();
		
		ArrayBndQueue<String> q1 = new ArrayBndQueue<String>();
		
		q1.enqueue("One");
		System.out.println(q1.dequeue());
		q1.enqueue("Two");
		q1.enqueue("Three");
		q1.enqueue("Four");
		System.out.println(q1.dequeue());
		
		System.out.println(q1.toString());

	}

}

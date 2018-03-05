package ch05.queues;

import support.LLNode;

// Stephen Cardone CH5 Lab01

public class CircLinkedUnbdQueue<T> implements UnboundedQueueInterface<T>{

	protected LLNode<T> rear;
	
	@Override
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			// Throw exception if we try to dequeue an empty queue
			throw new QueueUnderflowException();
		}
		else {
			// If rear.getLink == rear then there is only 1 item in the que linking to itself.
			// in this case return the rear and our queue is empty
			if (rear.getLink() == rear) {
				T send = rear.getInfo();
				rear = null;
				
				return send;
			}
			
			// if its not empty, return the rear.getlink (AKA the front) then set the rear.link
			//to the rear.link().link() AKA the front's link
			LLNode<T> temp = rear.getLink();
			rear.setLink(rear.getLink().getLink());
			return temp.getInfo();
		}
	}

	@Override
	public boolean isEmpty() {
		if( rear == null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void enqueue(Object element) {
		
		LLNode<T> newRear = new LLNode<T>(null);
		newRear.setInfo((T) element);
		
		if (rear == null) {
			newRear.setLink(newRear);
			rear = newRear;
		} else {
			newRear.setLink(rear.getLink());
			rear.setLink(newRear);
			rear = newRear;
		}
		
	}

}

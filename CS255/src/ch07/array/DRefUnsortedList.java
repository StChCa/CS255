package ch07.array;
import ch06.lists.ListInterface;
import support.DLLNode;

public class DRefUnsortedList<T> implements ListInterface<T>{

	  protected int numElements;      // number of elements in this list
	  protected DLLNode<T> currentPos; // current position for iteration

	  // set by find method
	  protected boolean found;        // true if element found, else false
	  protected DLLNode<T> location;   // node containing element, if found

	  protected DLLNode<T> list;       // first node on the list
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	@Override
	public void add(T element) {
		DLLNode<T> newNode = new DLLNode<T>(element);
		//Below from class not implemented in my dllnode
		//newNode.setNextNode(list);
		//if(list != null)
			//list.setPrevNode(newNode);
		list = newNode;
		numElements++;
		
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getNext() {
	    T next = currentPos.getInfo();
	    if (currentPos.getNextNode() == null)
	      currentPos = list;
	    else
	      currentPos = (DLLNode<T>) currentPos.getNextNode();
	    return next;
	}

}

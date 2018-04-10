package ch07.array;
import ch06.lists.ListInterface;
import support.DLLNode;

public class DCRefHeaderSortedList<T extends Comparable<T>> implements ListInterface<T>  {
	protected int numElements;      // number of elements in this list
	protected DLLNode<T> currentPos; // current position for iteration, should be global

	// set by find method
	protected boolean found;        // true if element found, else false
	protected DLLNode<T> location;   // node containing element, if found, modified locally by multiple methods
	protected DLLNode<T> list;       // first node on the list - this is a header node


	// create the header node with the info given by the application
	public DCRefHeaderSortedList(T info) {
		numElements = 0;
		list = new DLLNode(info);
		list.setNextNode(list);
		list.setPrevNode(list);
		currentPos = list;
		numElements++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	public boolean find(T element) {
		location = list.getNextNode();
		found = false;
		while (location != list) {
			if (location.getInfo().equals(element)) {
				found = true;
				return found;
			}
			location = location.getNextNode();
		}

		return false;
	}
	@Override
	public void add(T element) {
		// Add a new element to the list
		
	}

	@Override
	public boolean remove(T element) {
		// Remove the element if it's in the list.  Return true if successful, false otherwise
		return true;
	}

	@Override
	public boolean contains(T element) {
		// Return true if element is found in the list
		return find(element);
	}

	@Override
	public T get(T element) {
		// Return the element info if it's found in the list
		if (find(element))
			return location.getInfo();
		return null;
	}

	@Override
	public void reset() {
		// Set the current position to the header of the list
		currentPos = list;
	}

	@Override
	public T getNext() {
		// Return the information of the next node

		return null;
	}

	public T getPrev() {
		// Return the information of the previous node

		return null;
	}

	public String toString()
	// Returns a nicely formatted string that represents this list.
	{
		String retStr = "";
		DLLNode<T> parse = list;
		for (int x = 0 ; x < numElements; x++) {
			retStr += parse.getInfo();
			parse = parse.getNextNode();
		}
		return retStr;
	}

	public String revString()
	// Returns a nicely formatted string that represents this list.
	{

		return "";
	}
}

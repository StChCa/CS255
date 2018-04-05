//----------------------------------------------------------------------------
// ArrayRefSortedList.java       by Dale/Joyce/Weems                 Chapter 7
// 
// Implements an array-based sorted linked list of String
//----------------------------------------------------------------------------

package ch07.array;

import ch06.lists.*;

public class ArrayRefSortedStringList implements ListInterface<String> {
	protected static final int NUL = -1; // End of list symbol

	protected class AListNode {
		private String info; // The info in a list node
		private int next; // A link to the next node on the list
	}

	protected AListNode[] nodes; // Array of AListNode holds the linked list

	protected int list; // Reference to the first node on the list
	protected int free; // Reference to the first node on the free list

	protected int numElements; // Number of elements in the list
	protected int currentPos; // Current position for iteration

	// set by find method
	protected boolean found; // true if element found, else false
	protected int location; // node containing element, if found
	protected int previous; // node preceding location

	public ArrayRefSortedStringList(int maxElements)
	// Instantiates and returns a reference to an empty list object with
	// room for maxElements elements
	{
		nodes = new AListNode[maxElements];
		for (int index = 0; index < maxElements; index++)
			nodes[index] = new AListNode();

		// Link together the free nodes.
		for (int index = 1; index < maxElements; index++)
			nodes[index - 1].next = index;
		nodes[maxElements - 1].next = NUL;

		list = NUL;
		free = 0;
		numElements = 0;
		currentPos = NUL;
	}

	@Override
	public void add(String element) {
		int prevLoc;
		int currLoc;
		int newLoc;

		String currElement;

		currLoc = list;
		prevLoc = NUL;

		while (currLoc != NUL) {
			if (nodes[currLoc].info.compareTo(element) < 0) {
				prevLoc = currLoc;
				currLoc = nodes[currLoc].next;
			} else
				break;
		}

		newLoc = getNode();
		nodes[newLoc].info = element;

		nodes[newLoc].next = currLoc;

		if (prevLoc == NUL)
			list = newLoc;
		else
			nodes[prevLoc].next = newLoc;

		numElements++;
	}

	public boolean remove(String element)
	// Removes an element e from this list such that e.equals(element)
	// and returns true; if no such element exists, returns false
	{
		int hold; // To remember removed node index
		find(element);
		if (found) {
			hold = location;
			if (list == location) {
				list = nodes[list].next; // remove first node
				freeNode(location);
			}
			else
				nodes[previous].next = nodes[location].next;
			freeNode(hold);
			numElements--;
		}
		return found;
	}

	private void find(String element) {

		reset();
		found = false;
		previous = list;
		while (location != NUL) {
			if (nodes[location].info.equals(element)) {
				found = true;
				return;
			} else {
				previous = location;
				location = nodes[location].next;
			}
		}
	}

	@Override
	public String get(String element) {
		// TODO Auto-generated method stub
		find(element);
		if (found)
			return nodes[location].info;
		else
			return null;
	}

	@Override
	public String getNext() {
		// TODO Auto-generated method stub
		if (currentPos == -1)
			return "No Next";

		String temp = nodes[currentPos].info;
		currentPos = nodes[currentPos].next;

		return temp;
	}

	protected int getNode()
	// Returns the index of the next available node from the free list
	// and updates the free list index
	{
		int hold;
		hold = free;
		free = nodes[free].next;
		return hold;
	}

	protected void freeNode(int index)
	// Frees the node at array position index by linking it into the
	// free list
	{
		nodes[index].next = free;
		free = index;
	}

	public boolean isFull()
	// Determines whether this list is full
	{
		return (free == NUL);
	}

	@Override
	public int size() {
		return numElements;
	}

	@Override
	public boolean contains(String element) {
		find(element);
		if (found)
			return true;
		return false;
	}

	@Override
	public void reset() {
		currentPos = list;
	}

	public String toString() {
		String retString = "";
		String addString = "";
		reset();

		for (int x = 0; x < numElements; x++) {
			// AListNode myNode = nodes[list];
			retString += getNext() + ", ";

		}
		return retString;
	}

	public void info() {
		System.out.println("List: " + list);
		System.out.println("free: " + free);
		System.out.println("NumEle: " + numElements);
		System.out.println("currPos: " + currentPos);
		System.out.println("location: " + location);
		System.out.println("previous: " + previous);
	}
}
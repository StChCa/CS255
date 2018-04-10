package ch07.array;

import ch06.lists.*;
import support.DLLNode;

public class DRefUnsortedList<T> implements ListInterface<T> {
	protected int numElements; // number of elements in this list
	protected DLLNode<T> currentPos; // current position for iteration

	// set by find method
	protected boolean found; // true if element found, else false
	protected DLLNode<T> location; // node containing element, if found

	protected DLLNode<T> list; // first node on the list
	protected DLLNode<T> endList; // last node of our list.

	public DRefUnsortedList() {
		numElements = 0;
		list = null;
		currentPos = null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	public boolean find(T element) {
		location = list;
		found = false;
		while (location != null) {
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
		DLLNode<T> newNode = new DLLNode<T>(element);
		newNode.setNextNode(list);
		if (numElements == 0)
			endList = newNode;
		if (list != null){
			list.setPrevNode(newNode);
		}
		list = newNode;
		numElements++;
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub

		find(element);
		if (found) {
			// if it is the endList then make the new endList be the endList.getPrev then continue
			if(location == endList){
				endList = endList.getPrevNode();
			}
			// if this is not the first node
			if (location.getPrevNode() != null) {
				location.getPrevNode().setNextNode(location.getNextNode());
				if (location.getNextNode() != null) {
					location.getNextNode().setPrevNode(location.getPrevNode());
				}
				location.reset();
			} else {
				if (location.getNextNode() != null) {
					location.getNextNode().setPrevNode(location.getPrevNode());
				}
				list = location.getNextNode();
				location.reset();
			}
		}

		return found;
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
		currentPos = list;

	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		T next = currentPos.getInfo();
		if (currentPos.getNextNode() == null)
			currentPos = list;
		else
			currentPos = currentPos.getNextNode();
		return next;
	}

	public T getPrev() {
		// TODO Auto-generated method stub
		T next = currentPos.getInfo();
		if (currentPos.getPrevNode() == null)
			currentPos = list;
		else
			currentPos = currentPos.getPrevNode();
		return next;
	}

	public String toString() {
		currentPos = list;
		String retStr = "";

		while (currentPos != null) {
			retStr += currentPos.getInfo().toString();
			currentPos = currentPos.getNextNode();
		}
		return retStr;
	}

	public String revString() {
		currentPos = list;
		String retStr = "";

		return revStringRec(currentPos);
	}

	public String revStringRec(DLLNode<T> currNode) {
		if (currNode == null)
			return "";
		else
			return revStringRec(currNode.getNextNode()) + currNode.getInfo().toString();
	}
	
	public String firstAndLastNodes(){
		return list.getInfo().toString() + " " + endList.getInfo().toString();
	}
}
